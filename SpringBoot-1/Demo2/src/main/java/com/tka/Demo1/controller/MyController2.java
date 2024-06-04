package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController2 {

	@GetMapping("getmapping")
	public String myGetMapping() {
		
		return "GETMapping is working in MyController2";
		
	}
	
	@GetMapping("getparticularrecord/{id}")
	public String getParticularRecord(@PathVariable int id) {
		
		System.out.println("id is: "+id);
		
		return "Get Record...";
	}
	
	@PutMapping("updaterecord")
	public String updaterecord(@RequestParam int id) {
		
		System.out.println("Id is: "+id);
		
		return "Update Record...";
	}
}
