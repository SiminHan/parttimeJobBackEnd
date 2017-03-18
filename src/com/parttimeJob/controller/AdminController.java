/**
 * 
 */
package com.parttimeJob.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.UserDetailVo;

/**
 * @author simin
 *
 */
//@RequestMapping("/admin")
public interface AdminController {

	//@RequestMapping("/viewUsers")
	public Object viewUsers(HttpSession session ) throws Exception;
	
	//@RequestMapping("/checkUsers")
	public CodeMsgVo checkUsers(HttpSession session ,UserDetailVo userDetailVo) throws Exception;
	
}
