package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		
		return "My Second Restful API using POST method!!";
	}
	
	@RequestMapping(value = "mythirdapi", method = RequestMethod.PUT)
	public String myThirdAPI(@RequestBody Employee emp) {
		
		System.out.println("myThirdAPI...");
		
		System.out.println(emp);
		
		return "My Third Restful API using PUT method";
	}
	
	@RequestMapping(value = "myfourthapi", method = RequestMethod.DELETE)
	public String myFourthAPI(@RequestBody Employee emp) {
		
		System.out.println("myFourthAPI...");
		
		System.out.println(emp);
		
		return "My Fourth Restful API using DELETE method";
	}
	
	@GetMapping("getmapping")
	public String myGetMapping() {
		
		return "GETMapping is working";
		
	}
	
	@PostMapping("postmapping")
	public String myPostMapping(@RequestBody Employee emp) {
		
		System.out.println(emp);
		
		return "POSTMapping is working";
	}
	
	@PutMapping("putmapping")
	public String myPutMapping(@RequestBody Employee emp) {
		
		System.out.println(emp);
		
		return "PUTMapping is working";
	}
	
	@DeleteMapping("deletemapping")
	public String myDeleteMapping(@RequestBody Employee emp) {
		
		System.out.println(emp);
		
		return "DELETEMapping is working";
	}
}

