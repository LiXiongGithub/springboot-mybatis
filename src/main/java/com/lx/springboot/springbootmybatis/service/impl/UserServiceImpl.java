package com.lx.springboot.springbootmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lx.springboot.springbootmybatis.mapper.UserMapper;
import com.lx.springboot.springbootmybatis.service.UserService;
import com.lx.springboot.springbootmybatis.vo.User;

@Service(value = "UserService")
public class UserServiceImpl implements UserService {

	@Autowired UserMapper userMapper;
	
	@Override
	public User getUserById(Integer id) {
		return userMapper.getUserById(id);
	}

}
