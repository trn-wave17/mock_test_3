package com.ibm.training.wave17.mocktest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ibm.training.wave17.mocktest.domain.User;

@Service
public class UserService {
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Jeanette", "Penddreth", "Female", "jpenddreth0@census.gov", "26.58.193.2"));
		users.add(new User(2, "Giavani", "Frediani", "Male", "gfrediani1@senate.gov", "229.179.4.212"));
		return users;
	}
	
	public User fetchUserById(String firstName) {
		int id =1;
		List<User> users = getAllUsers();
		return users.stream().filter(user->user.getId() == id).collect(Collectors.toList()).get(0);
	}

}
