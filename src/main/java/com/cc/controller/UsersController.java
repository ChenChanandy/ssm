package com.cc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cc.pojo.Users;
import com.cc.service.UsersService;

@Controller
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
	
	@RequestMapping("show")
	public String show(Model model) {
		List<Users> list = usersServiceImpl.show();
		model.addAttribute("list", list);
		return "index.jsp";
	}
}
