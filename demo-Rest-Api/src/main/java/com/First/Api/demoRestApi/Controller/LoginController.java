package com.First.Api.demoRestApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.First.Api.demoRestApi.Repository.LoginRepository;

@RestController
@RequestMapping(path = "/user")
public class LoginController {

	// Autowiring login repository
	@Autowired
	LoginRepository loginRepository;

	// To test that our service is up and running
	@GetMapping
	public String check() {
		return "Welcome to Spring Boot REST API";
	}

	/*
	 * This method return list of usernames
	 */
	@GetMapping(path = "/getusernames")
	public List<String> getAllUserNames() {
		return loginRepository.getAllUserNames();
	}
}
