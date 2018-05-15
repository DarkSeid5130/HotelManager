package com.gd.dzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gd.dzh.domain.Admin;
import com.gd.dzh.domain.AdminExample;
import com.gd.dzh.mapper.AdminMapper;
import com.gd.dzh.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminMapper adminMapper;
	
	//登录验证
	@Override
	public Admin adminLogin(String username, String password) {
		AdminExample example = new AdminExample();
		example.createCriteria()
		    .andUsernameEqualTo(username)
		    .andPasswordEqualTo(password);
		List<Admin> admins = adminMapper.selectByExample(example);
		if (admins!=null&&admins.size()>0) {
			return admins.get(0);
		}
		return null;
	}

}
