package com.udai.dao;

import com.udai.model.Person;

public interface IPersonDao {

	public long savePersonData(Person person);
	public Person getPersonData(long id);
	
}
