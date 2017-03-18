package com.parttimeJob.controller.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parttimeJob.controller.ApplicantController;
import com.parttimeJob.service.ApplicantService;
import com.parttimeJob.vo.ApplyParttimeJobVo;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.CommendForParttimeJobVo;
import com.parttimeJob.vo.DiscoveryDetailVo;
import com.parttimeJob.vo.PageOption;

@RequestMapping("/applicant")
@Controller
public class ApplicantControllerImpl implements ApplicantController{
	
	@Autowired
	ApplicantService applicantService;

	@Override
	@RequestMapping("/apply")
	public @ResponseBody CodeMsgVo apply(HttpSession session, ApplyParttimeJobVo applyParttimeJobVo) throws Exception {
		CodeMsgVo vo = new CodeMsgVo();
		vo = applicantService.apply(session,applyParttimeJobVo);
		return vo;
	}

	@Override
	@RequestMapping("/commendForParttimeJob")
	public @ResponseBody CodeMsgVo commendForParttimeJob(HttpSession session, CommendForParttimeJobVo commendForParttimeVo) throws Exception {
		CodeMsgVo vo = new CodeMsgVo();
		vo = applicantService.commendForParttimeJob(session,commendForParttimeVo);
		return vo;
	}

	@Override
	@RequestMapping("/viewInfomation")
	public @ResponseBody Object viewInfomation(HttpSession session, Long userId, PageOption pageOption) throws Exception {
		return applicantService.viewInfomation(session,userId,pageOption);
	}

	@Override
	@RequestMapping("/viewApplyJobs")
	public @ResponseBody Object viewApplyJobs(HttpSession session, Long userId, PageOption pageOption) throws Exception {
		return applicantService.viewApplyJobs(session,userId,pageOption);
	}

	@Override
	@RequestMapping("/publishDiscovery")
	public @ResponseBody CodeMsgVo publishDiscovery(HttpSession session, DiscoveryDetailVo discoveryVo) throws Exception {
		return applicantService.publishDiscovery(session,discoveryVo);
	}

}
