/**
 * 
 */
package com.parttimeJob.controller.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parttimeJob.controller.UserController;
import com.parttimeJob.service.UserService;
import com.parttimeJob.vo.CodeMsgVo;
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

@RequestMapping("/user")
@Controller
public class UserControllerImpl implements UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/sayHello")
	public @ResponseBody String sayHello() throws Exception{
		String result = new String("hello world!");
        return result;
	}

	@Override
	@RequestMapping("/regest")
	public @ResponseBody CodeMsgVo regest(HttpSession session, RegestVo regestVo) throws Exception {
		CodeMsgVo vo = userService.regest(regestVo);
		return vo;
	}

	@Override
	@RequestMapping("/login")
	public @ResponseBody CodeMsgVo login(HttpSession session, LoginVo loginVo) throws Exception {
		CodeMsgVo vo = userService.login(session,loginVo);
		return vo;
	}

	@Override
	@RequestMapping("/logout")
	public @ResponseBody CodeMsgVo logout(HttpSession session) throws Exception {
		CodeMsgVo vo = userService.logout(session);
		return vo;
	}

	@Override
	@RequestMapping("/getUserDetail")
	public @ResponseBody Object getUserDetail(HttpSession session, Long userId) throws Exception {
		return userService.getUserDetail(session,userId);
	}

	@Override
	@RequestMapping("/updateUserDetail")
	public @ResponseBody CodeMsgVo updateUserDetail(HttpSession session, UserDetailVo userDetailVo) throws Exception {
		return userService.updateUserDetail(session,userDetailVo);
	}

	@Override
	@RequestMapping("/updateUserPassword")
	public @ResponseBody CodeMsgVo updateUserPassword(HttpSession session, Long userId, String oldPwd, String newPwd) throws Exception {
		return userService.updateUserPassword(session,userId,oldPwd,newPwd);
	}

	@Override
	@RequestMapping("/findbackUserPassword")
	public @ResponseBody CodeMsgVo findbackUserPassword(HttpSession session, Long userId) throws Exception {
	  //return userService.findbackUserPassword(session,userId);
		return null;
	}

	@Override
	@RequestMapping("/viewParttimeJobsSummary")
	public @ResponseBody ParttimeJobSummaryListVo viewParttimeJobsSummary(HttpSession session, PageOption pageOption) throws Exception {
		return userService.viewParttimeJobsSummary(session,pageOption);
	}

	@Override
	@RequestMapping("/viewParttimeJobDetail")
	public @ResponseBody ParttimeJobInfoVo viewParttimeJobDetail(HttpSession session, Long ptId) throws Exception {
		return userService.viewParttimeJobDetail(session,ptId);
	}

	@Override
	@RequestMapping("/sendMessageToUser")
	public @ResponseBody CodeMsgVo sendMessageToUser(HttpSession session, InfomationVo infomationVo) throws Exception {
		return userService.sendMessageToUser(session,infomationVo);
	}

	@Override
	@RequestMapping("/viewDiscoverySummary")
	public @ResponseBody Object viewDiscoverySummary(HttpSession session, PageOption pageOption) throws Exception {
		return userService.viewDiscoverySummary(session,pageOption);
	}

	@Override
	@RequestMapping("/viewDiscoveryDetail")
	public @ResponseBody Object viewDiscoveryDetail(HttpSession session, Long discoveryId) throws Exception {
		return userService.viewDiscoveryDetail(session,discoveryId);
	}
	

}
