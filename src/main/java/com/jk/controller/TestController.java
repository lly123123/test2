package com.jk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jk.model.User;
import com.jk.service.TestService;

@Controller
@RequestMapping("job")
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping("testCount")
	@ResponseBody
	public List<User> testCount(User user) {
		List<User> list = testService.testCount(user);
		return list;
	}
	@RequestMapping(value = "/saveUser")
	@ResponseBody
	public void saveUser(){
		testService.saveUser();
	}

}
