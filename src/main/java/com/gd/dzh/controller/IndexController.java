package com.gd.dzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 负责页面跳转
 * **/
@Controller
public class IndexController {

	// 跳转到index.html页面
	@RequestMapping("/index")
	public String index() {

		return "main";
	}
	// 跳转到room.html页面
	@RequestMapping("/room")
	public String room() {

		return "room";
	}

	// 跳转到room.html页面
	@RequestMapping("/changePass")
	public String change() {

		return "changePass";
	}
	
	
	
}
