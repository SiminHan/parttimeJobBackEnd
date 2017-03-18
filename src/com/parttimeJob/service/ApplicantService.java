package com.parttimeJob.service;

import javax.servlet.http.HttpSession;

import com.parttimeJob.vo.ApplyParttimeJobVo;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.CommendForParttimeJobVo;
import com.parttimeJob.vo.DiscoveryDetailVo;
import com.parttimeJob.vo.PageOption;

public interface ApplicantService {

	public CodeMsgVo apply(HttpSession session, ApplyParttimeJobVo applyParttimeJobVo) throws Exception;

	public CodeMsgVo publishDiscovery(HttpSession session, DiscoveryDetailVo discoveryVo) throws Exception;

	public Object viewInfomation(HttpSession session, Long userId, PageOption pageOption) throws Exception;

	public Object viewApplyJobs(HttpSession session, Long userId, PageOption pageOption) throws Exception;

	public CodeMsgVo commendForParttimeJob(HttpSession session, CommendForParttimeJobVo commendForParttimeVo) throws Exception;

}
