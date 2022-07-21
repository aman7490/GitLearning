package com.aman.gitlearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitLearningController {

	@GetMapping(value = "/getdata")
	public void getdata() {
		System.out.println("Get data");
	}
	
	
	
}
