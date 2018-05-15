package com.gd.dzh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gd.dzh.domain.Admin;
import com.gd.dzh.service.AdminService;

@Controller
public class LoginController {
	
	@Autowired
	@Qualifier("adminService")
	private AdminService adminservice;
	
	@RequestMapping("/login")
	public String loginCheck(String username,String password,HttpServletRequest request){
		//进行登录操作验证
		System.out.println(username+" "+password);
		Admin admin = adminservice.adminLogin(username, password);
		System.err.println(admin);
		if (admin!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("user_session", admin);
			session.setMaxInactiveInterval(24 * 60 * 60);
			System.out.println("end");
			return "index";
		}else {
			
		}
		
		return null;
	}
}
