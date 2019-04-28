package com.cc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cc.mapper.UsersMapper;
import com.cc.pojo.Users;
import com.cc.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper usersMapper;
	
	@Override
	public List<Users> show() {
		return usersMapper.selAll();
	}
	
}
