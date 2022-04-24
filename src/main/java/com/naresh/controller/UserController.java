package com.naresh.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.model.User;

@RestController
public class UserController {

	@GetMapping(
			value = "users",
			//consumes = {"application/json","application/xml"}, 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	)
	public List<User> getUsers(){
		User user1 = new User("Naresh");
		User user2 = new User("Siva");
		List<User> users = List.of(user1, user2);
		return users;
	}
}
