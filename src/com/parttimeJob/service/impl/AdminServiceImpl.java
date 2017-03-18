package com.parttimeJob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parttimeJob.mapper.AdminMapper;
import com.parttimeJob.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminMapper;
}
