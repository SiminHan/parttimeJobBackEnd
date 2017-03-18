package com.parttimeJob.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parttimeJob.conf.ReturnCode;
import com.parttimeJob.mapper.ApplicantMapper;
import com.parttimeJob.pojo.User;
import com.parttimeJob.service.ApplicantService;
import com.parttimeJob.vo.ApplyParttimeJobVo;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.CommendForParttimeJobVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.ParttimeJobSummaryListVo;
import com.parttimeJob.vo.DiscoveryDetailVo;

@Service("applicantService")
public class ApplicantServiceImpl implements ApplicantService{
	
	@Autowired
	ApplicantMapper applicantMapper;

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
	public CodeMsgVo apply(HttpSession session, ApplyParttimeJobVo applyParttimeJobVo) throws Exception {
		CodeMsgVo vo = getUserValid(session,applyParttimeJobVo.getUserId());
		if(vo.getState() == ReturnCode.SUCCESS){
			int result = applicantMapper.apply(applyParttimeJobVo);
			if(result > 0){
				vo.setState(ReturnCode.SUCCESS);
				vo.setMassage("报名成功");
			}else {
				vo.setState(ReturnCode.FAILURE);
				vo.setMassage("报名失败");
			}
		}
		return vo;
	}

	@Override
	public CodeMsgVo publishDiscovery(HttpSession session, DiscoveryDetailVo discoveryVo) throws Exception {
		CodeMsgVo vo = getUserValid(session,discoveryVo.getUserId());
		if(vo.getState() == ReturnCode.SUCCESS){
			int result = applicantMapper.publishDiscovery(discoveryVo);
			if(result > 0){
				vo.setState(ReturnCode.SUCCESS);
				vo.setMassage("发现信息发送成功");
			}else {
				vo.setState(ReturnCode.FAILURE);
				vo.setMassage("发现信息发送失败");
			}
		}
		return vo;
	}

	@Override
	public Object viewInfomation(HttpSession session, Long userId, PageOption pageOption) throws Exception {
		CodeMsgVo vo = getUserValid(session,userId);
		if(vo.getState() == ReturnCode.SUCCESS){
			return applicantMapper.viewInfomation(userId);
		}
		return vo;
	}

	@Override
	public Object viewApplyJobs(HttpSession session, Long userId, PageOption pageOption) throws Exception {
		CodeMsgVo vo = getUserValid(session,userId);
		if(vo.getState() == ReturnCode.SUCCESS){
			ParttimeJobSummaryListVo parttimeJobSummaryListVo = new ParttimeJobSummaryListVo();
			parttimeJobSummaryListVo.setItems(applicantMapper.viewApplyJobs(userId));
			return  parttimeJobSummaryListVo;
		}
		return vo;
	}

	@Override
	public CodeMsgVo commendForParttimeJob(HttpSession session, CommendForParttimeJobVo commendForParttimeVo)
			throws Exception {
		CodeMsgVo vo = getUserValid(session,commendForParttimeVo.getFromUserId());
		if(vo.getState() == ReturnCode.SUCCESS){
			System.err.println(commendForParttimeVo.getCommend());
			int result = applicantMapper.commendForParttimeJob(commendForParttimeVo);
			if(result > 0){
				vo.setState(ReturnCode.SUCCESS);
				vo.setMassage("评论发送成功");
			}else {
				vo.setState(ReturnCode.FAILURE);
				vo.setMassage("评论发送失败");
			}
		}
		return vo;
	}

}
