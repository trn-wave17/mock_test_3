package com.ibm.training.wave17.mocktest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ibm.training.wave17.mocktest.domain.User;
import com.ibm.training.wave17.mocktest.service.UserService;

@Controller
public class AppController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Gson gson;
	
	@RequestMapping("/users")
	@ResponseBody
	public String getUsers() {
		List<User> users = userService.getAllUsers();
		return gson.toJson(users, ArrayList.class);
	}
	
	@RequestMapping("/home")
	public String getHome(Model model) {
		return "index";
	}
	
	@RequestMapping("/user")
	public String getUser(Model model, User user) {
		model.addAttribute("user", userService.fetchUserById(user.getFirstName()));
		return "user";
	}

}
