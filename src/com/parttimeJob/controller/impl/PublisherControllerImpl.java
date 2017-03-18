package com.parttimeJob.controller.impl;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parttimeJob.controller.PublisherController;
import com.parttimeJob.service.PublisherService;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.ParttimeJobInfoVo;

@Controller
@RequestMapping("/publisher")
public class PublisherControllerImpl implements PublisherController {
	
	@Autowired
	PublisherService publisherService;

	@Override
	@RequestMapping("/publish")
	public @ResponseBody CodeMsgVo publish(HttpSession session, ParttimeJobInfoVo parttimeJobInfoVo) throws Exception {
		CodeMsgVo vo = publisherService.publish(session,parttimeJobInfoVo);
		return vo;
	}

	@Override
	@RequestMapping("/viewApplicantsSummary")
	public @ResponseBody Object viewApplicantsSummary(HttpSession session,Long ptId, PageOption pageOption) throws Exception {
		return publisherService.viewApplicantsSummary(session,ptId,pageOption);
	}

	@Override
	@RequestMapping("/viewApplicantDetail")
	public @ResponseBody Object viewApplicantDetail(HttpSession session, Long userId) throws Exception {
		return publisherService.viewApplicantDetail(session,userId);
	}

	@Override
	@RequestMapping("/sendMessageToUsers")
	public @ResponseBody CodeMsgVo sendMessageToUsers(HttpSession session, InfomationVo infomationVo,ArrayList<Long> userIds) throws Exception {
		return publisherService.sendMessageToUsers(session,infomationVo,userIds);
	}

}
