package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Demo1.entity.Employee;

@RestController
public class MyController {

	@RequestMapping("myfirstapi")
	public String myFirstAPI() {
		return "My first Restful API!";
	}

	@RequestMapping(value = "mysecondapi", method = RequestMethod.POST)
	public String mySecondAPI(@RequestBody Employee emp) {
		
		System.out.println("mySecondAPI...");
		
		System.out.println(emp);
		
		return "My Second Restful API!!";
	}
}

