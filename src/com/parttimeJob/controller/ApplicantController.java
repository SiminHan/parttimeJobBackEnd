package com.parttimeJob.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

import com.parttimeJob.vo.ApplyParttimeJobVo;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.CommendForParttimeJobVo;
import com.parttimeJob.vo.DiscoveryDetailVo;
import com.parttimeJob.vo.PageOption;

//@RequestMapping("/applicant")
public interface ApplicantController {

	//@RequestMapping("/apply")
	public CodeMsgVo apply(HttpSession session , ApplyParttimeJobVo applyParttimeJobVo) throws Exception;
	
	//@RequestMapping("/commendForParttimeJob")
	public CodeMsgVo commendForParttimeJob(HttpSession session , CommendForParttimeJobVo commendForParttimeVo) throws Exception;
	
	//@RequestMapping("/viewInfomation")
	public Object viewInfomation(HttpSession session , Long userId ,PageOption pageOption) throws Exception;
	
	//@RequestMapping("/viewApplyJobs")
	public Object viewApplyJobs(HttpSession session , Long userId ,PageOption pageOption) throws Exception;
	
	
	//@RequestMapping("/publishDiscovery")
	public CodeMsgVo publishDiscovery(HttpSession session , DiscoveryDetailVo discoveryVo) throws Exception;
	
}
