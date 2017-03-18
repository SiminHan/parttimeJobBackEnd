package com.parttimeJob.controller.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parttimeJob.controller.AdminController;
import com.parttimeJob.service.AdminService;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.UserDetailVo;

@Controller
@RequestMapping("/admin")
public class AdminControllerImpl implements AdminController{

	@Autowired
	AdminService adminService;
	
	@Override
	@RequestMapping("/viewUsers")
	public Object viewUsers(HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping("/checkUsers")
	public CodeMsgVo checkUsers(HttpSession session, UserDetailVo userDetailVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
