package com.lx.springboot.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Select;

import com.lx.springboot.springbootmybatis.vo.User;

public interface UserMapper {
	@Select("SELECT * FROM user WHERE id = #{id}")
	User getUserById(Integer id);
}
