package com.udai.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udai.dao.IPersonDao;
import com.udai.model.Person;
import com.udai.service.IPersonService;

@Service
public class PersonServiceImpl  implements IPersonService{

	@Autowired
	private IPersonDao personDao;
	
	@Transactional
	public long savePersonData(Person person) {
		System.err.println(personDao);
		return personDao.savePersonData(person);
		
	}
	@Override
	@Transactional(readOnly = true)
	public Person getPersonData(long id) {
		System.err.println(personDao);
		Person person=personDao.getPersonData(id);
		if(person!=null)
		return person;
		
		return null;
	}
}
