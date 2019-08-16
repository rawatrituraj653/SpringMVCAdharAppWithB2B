package com.udai.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.udai.dao.IPersonDao;
import com.udai.model.Person;

@Repository
public class PersonDaoImpl implements IPersonDao {

	@Autowired
	private HibernateTemplate template;
	
	@Override
	public long savePersonData(Person person) {
		System.out.println(template);
		return (long)template.save(person);
	}
	
	@Override
	public Person getPersonData(long id) {
		System.out.println(template);
		Person person=template.get(Person.class, id);
		System.out.println(person);
		return person;
	}
}
