package com.parttimeJob.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.ParttimeJobInfoVo;

public interface PublisherService {

	public CodeMsgVo publish(HttpSession session, ParttimeJobInfoVo parttimeJobInfoVo) throws Exception;

	public Object viewApplicantsSummary(HttpSession session, Long ptId, PageOption pageOption) throws Exception;

	public CodeMsgVo sendMessageToUsers(HttpSession session, InfomationVo infomationVo,ArrayList<Long> userIds) throws Exception;

	public Object viewApplicantDetail(HttpSession session, Long userId) throws Exception;

}
