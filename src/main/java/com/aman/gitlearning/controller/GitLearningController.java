package com.aman.gitlearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitLearningController {

	@GetMapping(value = "/getdata")
	public void getdata() {
		System.out.println("Get data");
	}
	
	@GetMapping(value = "/getdatafeatureb")
	public void getfeatureb_added() {
		System.out.println("Get data feature b");
	}
	
	
}
