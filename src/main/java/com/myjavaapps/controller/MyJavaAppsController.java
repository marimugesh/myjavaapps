package com.myjavaapps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJavaAppsController {
	@GetMapping(path="/getDetails")
	public String getdata() {
		return "Dracarysss.....";
	}

}
