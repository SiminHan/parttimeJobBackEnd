package com.parttimeJob.service;

import javax.servlet.http.HttpSession;

import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.LoginVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.ParttimeJobInfoVo;
import com.parttimeJob.vo.ParttimeJobSummaryListVo;
import com.parttimeJob.vo.RegestVo;
import com.parttimeJob.vo.UserDetailVo;

public interface UserService {

	public CodeMsgVo regest(RegestVo regestVo) throws Exception;

	public CodeMsgVo login(HttpSession session, LoginVo loginVo) throws Exception;

	public CodeMsgVo logout(HttpSession session) throws Exception;

	public Object getUserDetail(HttpSession session, Long userId) throws Exception;

	public CodeMsgVo updateUserDetail(HttpSession session, UserDetailVo userDetailVo) throws Exception;

	public CodeMsgVo updateUserPassword(HttpSession session, Long userId, String oldPwd, String newPwd) throws Exception;

	public CodeMsgVo getUserValid(HttpSession session,Long userId) throws Exception;

	public ParttimeJobSummaryListVo viewParttimeJobsSummary(HttpSession session, PageOption pageOption) throws Exception;

	public ParttimeJobInfoVo viewParttimeJobDetail(HttpSession session, Long ptId) throws Exception;

	public CodeMsgVo sendMessageToUser(HttpSession session, InfomationVo infomationVo) throws Exception;

	public Object viewDiscoverySummary(HttpSession session, PageOption pageOption) throws Exception;

	public Object viewDiscoveryDetail(HttpSession session, Long discoveryId) throws Exception;

}
