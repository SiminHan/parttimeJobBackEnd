package com.parttimeJob.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.ParttimeJobInfoVo;

//@RequestMapping("/publisher")
public interface PublisherController {

	//@RequestMapping("/publish")
	public CodeMsgVo publish(HttpSession session,ParttimeJobInfoVo parttimeJobInfoVo) throws Exception;
	
	//@RequestMapping("/viewApplicantsSummary")
	public Object viewApplicantsSummary(HttpSession session,Long ptId,PageOption pageOption) throws Exception;
	
	//@RequestMapping("/viewApplicantDetail")
	public Object viewApplicantDetail(HttpSession session,Long userId) throws Exception;
	
	//@RequestMapping("/sendMessageToUsers")
	public CodeMsgVo sendMessageToUsers(HttpSession session,InfomationVo infomationVo,ArrayList<Long> userIds) throws Exception;
	
	
}
