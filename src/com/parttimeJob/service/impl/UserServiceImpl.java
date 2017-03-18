/**
 * 
 */
package com.parttimeJob.service.impl;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parttimeJob.conf.ReturnCode;
import com.parttimeJob.mapper.UserMapper;
import com.parttimeJob.pojo.User;
import com.parttimeJob.service.UserService;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.DiscoverySummaryListVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.LoginVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.ParttimeJobInfoVo;
import com.parttimeJob.vo.ParttimeJobSummaryListVo;
import com.parttimeJob.vo.RegestVo;
import com.parttimeJob.vo.UserDetailVo;

/**
 * @author simin
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public CodeMsgVo regest(RegestVo regestVo) throws Exception {
		CodeMsgVo vo = new CodeMsgVo();
		User user = userMapper.findUserByName(regestVo.getUsername());
		if(user != null){
			vo.setMassage("用户名已存在");
			vo.setState(ReturnCode.USER_EXIST);
		}else {
			user = new User();
			user.setUsername(regestVo.getUsername());
			user.setPassword(regestVo.getPassword());
			System.out.println(user);
			int result = userMapper.insertUser(user);
			System.out.println(result);

			if(result >=1 ){
				vo.setMassage("注册成功");
				vo.setState(ReturnCode.SUCCESS);
			}else {
				vo.setMassage("注册失败，请重新注册");
				vo.setState(ReturnCode.FAILURE);
			}
		}
		return vo;
	}

	@Override
	public CodeMsgVo login(HttpSession session, LoginVo loginVo) throws Exception{
		CodeMsgVo codeMsgVo = new CodeMsgVo();
		User user = userMapper.getUserByUsername(loginVo.getUsername());
		if(user == null) {
			codeMsgVo.setState(ReturnCode.NOT_FIND_USER);
			codeMsgVo.setMassage("没有找到该用户");
		}else{
			if(user.getPassword().equals(loginVo.getPassword())) {
				codeMsgVo.setState(ReturnCode.SUCCESS);
				codeMsgVo.setMassage("登录成功");
				session.setAttribute("user", user);
			}else {
				codeMsgVo.setState(ReturnCode.ERROR_PASSWORD);
				codeMsgVo.setMassage("密码错误");
			}
		}
		return codeMsgVo;
	}

	@Override
	public CodeMsgVo logout(HttpSession session) throws Exception{
		session.invalidate();
		CodeMsgVo codeMsgVo = new CodeMsgVo(ReturnCode.SUCCESS,"退出成功");
		return codeMsgVo;
	}

	@Override
	public Object getUserDetail(HttpSession session, Long userId) throws Exception{
		CodeMsgVo codeMsgVo = new CodeMsgVo();
		if(userId!=null){
			UserDetailVo userVo = userMapper.getUserById(userId);
			return userVo;
		}else{
			codeMsgVo.setMassage("userId不能为空");
			codeMsgVo.setState(ReturnCode.EMPTY_ID);
			return codeMsgVo;
		}
	
	}
	
	@Override
	public CodeMsgVo getUserValid(HttpSession session,Long userId) throws Exception{
		CodeMsgVo codeMsgVo = null;
		User user = (User) session.getAttribute("user");
		if(user == null){
			codeMsgVo = new CodeMsgVo(ReturnCode.USER_NOT_LOGIN,"用户未登录");
		}else {
			if(user.getUserId()!= userId){
				codeMsgVo = new CodeMsgVo(ReturnCode.NOT_MATCH_SESSION,"用户与session中保存不一致");
			}else {
				codeMsgVo = new CodeMsgVo(ReturnCode.SUCCESS,"用户验证合法");
			}
		}
		return codeMsgVo;
		
	}

	@Override
	public CodeMsgVo updateUserDetail(HttpSession session, UserDetailVo userDetailVo) throws Exception {
		CodeMsgVo codeMsgVo = getUserValid(session,userDetailVo.getUserId());
		if(codeMsgVo.getState() == ReturnCode.SUCCESS){
			int result = userMapper.updateUserDetail(userDetailVo);
			if(result > 0){
				codeMsgVo = new CodeMsgVo(ReturnCode.SUCCESS,"用户信息更新成功");
			}else {
				codeMsgVo = new CodeMsgVo(ReturnCode.FAILURE,"用户信息更新失败");
			}
		}
		return codeMsgVo;
	}

	@Override
	public CodeMsgVo updateUserPassword(HttpSession session, Long userId, String oldPwd, String newPwd) throws Exception{
		CodeMsgVo codeMsgVo = getUserValid(session,userId);
		if(codeMsgVo.getState() == ReturnCode.SUCCESS){
			UserDetailVo userVo = userMapper.getUserById(userId);
			if(!userVo.getPassword().toString().equals(oldPwd.toString())){
				codeMsgVo = new CodeMsgVo(ReturnCode.PASSWORD_ERROR,"原密码不正确");
			}else {
				UserDetailVo userDetailVo = new UserDetailVo();
				userDetailVo.setUserId(userId);
				userDetailVo.setPassword(newPwd);
				int result = userMapper.updateUserDetail(userDetailVo);
				if(result > 0){
					codeMsgVo = new CodeMsgVo(ReturnCode.SUCCESS,"密码更新成功");
				}else {
					codeMsgVo = new CodeMsgVo(ReturnCode.FAILURE,"密码更新失败");
				}
			}
		}
		return codeMsgVo;
	}

	@Override
	public ParttimeJobSummaryListVo viewParttimeJobsSummary(HttpSession session, PageOption pageOption) throws Exception{
		ParttimeJobSummaryListVo vo = (ParttimeJobSummaryListVo) new ParttimeJobSummaryListVo();
		vo.setItems(userMapper.getParttimeJobSummaryList(pageOption));
		return vo;
	}

	@Override
	public ParttimeJobInfoVo viewParttimeJobDetail(HttpSession session, Long ptId) throws Exception {
		ParttimeJobInfoVo vo = userMapper.getParttimeJobDetail(ptId);
		return vo;
	}

	@Override
	public CodeMsgVo sendMessageToUser(HttpSession session, InfomationVo infomationVo) throws Exception {
		CodeMsgVo codeMsgVo = getUserValid(session,infomationVo.getFromUserId());
		if(codeMsgVo.getState() == ReturnCode.SUCCESS){
			int result = userMapper.sendMessageToUser(infomationVo);
			if(result > 0){
				codeMsgVo = new CodeMsgVo(ReturnCode.SUCCESS,"信息发送成功");
			}else {
				codeMsgVo = new CodeMsgVo(ReturnCode.FAILURE,"信息发送失败");
			}
		}
		return codeMsgVo;
	}

	@Override
	public Object viewDiscoverySummary(HttpSession session, PageOption pageOption) throws Exception {
		DiscoverySummaryListVo vo = new DiscoverySummaryListVo();
		vo.setItems(userMapper.getDiscoverySummary(pageOption));
		return vo;
	}

	@Override
	public Object viewDiscoveryDetail(HttpSession session, Long discoveryId) throws Exception {
		return userMapper.getDiscoveryDetail(discoveryId);
	}

}
