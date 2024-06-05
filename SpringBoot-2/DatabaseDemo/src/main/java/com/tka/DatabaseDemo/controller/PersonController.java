package com.tka.DatabaseDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.DatabaseDemo.entity.Person;
import com.tka.DatabaseDemo.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	PersonService service;
	
	@PostMapping("addperson")
	public String addPerson(@RequestBody Person p) {
		
	String str = service.addperson(p);
	return str;
		
	}
	
	@PutMapping("updateperson/{id}")
	public String updatePerson(@PathVariable int id, @RequestBody Person p) {
		
	String strmsg =	service.updateperson(id,p);
	return strmsg;
		
	}
	
	@DeleteMapping("deleteperson/{id}")
	public String deletePerson(@PathVariable int id) {
		
		String str=service.deletePerson(id);
		return str;
		
	}
	
	@GetMapping("getallrecord")
	public List<Person> getAllRecord() {
		
		List<Person> list = service.getAllRecord();
		return list;
		
	}
	
}
