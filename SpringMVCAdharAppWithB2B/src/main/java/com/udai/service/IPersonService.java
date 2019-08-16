package com.udai.service;

import com.udai.model.Person;

public interface IPersonService {

	public long savePersonData(Person person);
	public Person getPersonData(long id);
	
}
