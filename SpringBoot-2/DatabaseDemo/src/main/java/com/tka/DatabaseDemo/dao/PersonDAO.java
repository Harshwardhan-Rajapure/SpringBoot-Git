package com.tka.DatabaseDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.DatabaseDemo.entity.Person;

@Repository
public class PersonDAO {

	@Autowired
	SessionFactory factory;
	
	public void addperson(Person p) {
		
	Session session = factory.openSession();
		session.beginTransaction();
		
		session.persist(p);
		session.getTransaction().commit();
		
		session.close();
	}

	public String updateperson(int id,Person p) {

		Session session = factory.openSession();
		session.beginTransaction();
		
		Person person = session.get(Person.class, id);
		
		person.setName(p.getName());
		person.setMobileno(p.getMobileno());
		person.setEmailid(p.getEmailid());
		
		session.merge(person);
		
		session.getTransaction().commit();
		session.close();
		
		return "Record updated successfully";
		
	}

	public String deletePerson(int id) {

		Session session = factory.openSession();
		session.beginTransaction();
		
		Person p = session.get(Person.class, id);
		
		session.remove(p);
		session.getTransaction().commit();
		session.close();
		
		return "Record Deleted Successfully...";
	}

	public List<Person> getAllRecord() {
		// TODO Auto-generated method stub
		
		String hqlQuery = "from Person";
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Query<Person> query=  session.createQuery(hqlQuery, Person.class);
		
		List<Person> list = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return list;
		
		
	}
	
}
