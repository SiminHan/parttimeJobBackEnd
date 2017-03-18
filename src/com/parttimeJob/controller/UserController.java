package com.parttimeJob.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.LoginVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.RegestVo;
import com.parttimeJob.vo.UserDetailVo;
import com.parttimeJob.vo.DiscoveryDetailVo;

//@RequestMapping("/user")
public interface UserController {
	
	//@RequestMapping("/regest")
	public CodeMsgVo regest(HttpSession session, RegestVo regestVo) throws Exception;
	
	//@RequestMapping("/login")
	public CodeMsgVo login(HttpSession session,LoginVo loginVo) throws Exception;
	
	//@RequestMapping("/logout")
	public CodeMsgVo logout(HttpSession session) throws Exception;

	//@RequestMapping("/getUserDetail")
	public Object getUserDetail(HttpSession session,Long userId) throws Exception;
	
	//@RequestMapping("/updateUserDetail")
	public CodeMsgVo updateUserDetail(HttpSession session,UserDetailVo userDetailVo) throws Exception;
	
	//@RequestMapping("/updateUserPassword")
	public Object updateUserPassword(HttpSession session,Long userId,String oldPwd,String newPwd) throws Exception;
	
	//@RequestMapping("/findbackUserPassword")
	public CodeMsgVo findbackUserPassword(HttpSession session,Long userId) throws Exception;
	
	//@RequestMapping("/viewParttimeJobsSummary")
	public Object viewParttimeJobsSummary(HttpSession session,PageOption pageOption) throws Exception;
	
	//@RequestMapping("/viewParttimeJobDetail")
	public Object viewParttimeJobDetail(HttpSession session,Long ptId) throws Exception;
	
	//@RequestMapping("/sendMessageToUser")
	public CodeMsgVo sendMessageToUser(HttpSession session,InfomationVo infomationVo) throws Exception;
	
	//@RequestMapping("/viewDiscoverySummary")
	public Object viewDiscoverySummary(HttpSession session,PageOption pageOption) throws Exception;
	
	//@RequestMapping("/viewDiscoveryDetail")
	public Object viewDiscoveryDetail(HttpSession session,Long discoveryId) throws Exception;
	

}
