package com.lx.springboot.springbootmybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lx.springboot.springbootmybatis.service.UserService;
import com.lx.springboot.springbootmybatis.util.ResponseUtil;
import com.lx.springboot.springbootmybatis.vo.User;

@RestController
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired UserService userService;
	@RequestMapping("user/{id}")
	public ResponseEntity<ResponseUtil> selectUserById(@PathVariable(value = "id") Integer id){
		ResponseUtil response = new ResponseUtil();
		try {
			User user = userService.getUserById(id);
			logger.info(user.toString());
			response.setObj(user);
			response.setStatus("查询成功");
		} catch (Exception e) {
			// TODO: handle exception
			response.setObj(e.getClass().getName() + ":" + e.getMessage());
			response.setStatus("error");
			e.printStackTrace();
		}
		return ResponseEntity.ok(response);
	}
}
