package com.tka.DatabaseDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DatabaseDemo.dao.PersonDAO;
import com.tka.DatabaseDemo.entity.Person;

@Service
public class PersonService {

	@Autowired
	PersonDAO dao;
	
	public String addperson(Person p) {
		
		dao.addperson(p);
		return "Data added Successfully !!";
		
	}

	public String updateperson(int id,Person p) {

	String str = dao.updateperson(id,p);
		return str;
		
	}

	public String deletePerson(int id) {
		// TODO Auto-generated method stub
		String str= dao.deletePerson(id);
		return str;
		
	}

	public List<Person> getAllRecord() {
		// TODO Auto-generated method stub
		List<Person> list= dao.getAllRecord();
		
		return list;
	}
	
}
