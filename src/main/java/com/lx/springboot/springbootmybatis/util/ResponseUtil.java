package com.lx.springboot.springbootmybatis.util;

import com.alibaba.fastjson.JSON;

public class ResponseUtil {
	private String status=null;
	private Object obj=null;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}
