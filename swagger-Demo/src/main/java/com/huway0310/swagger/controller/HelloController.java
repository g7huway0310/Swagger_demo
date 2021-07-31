package com.huway0310.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.huway0310.swagger.model.User;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/user")
	public User getUser() {
		return new User();
	}
	
	@ApiOperation("狂神的接口")
	@PostMapping("/kuang")
	public User wei(@ApiParam("這個名字會被回傳")User user) {
		return user;
	}

}
