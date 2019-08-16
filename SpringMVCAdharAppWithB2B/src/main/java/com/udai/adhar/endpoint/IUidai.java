package com.udai.adhar.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.udai.model.Person;

@WebService
public interface IUidai {
	
	@WebMethod
	public @WebResult Person getAdharData(@WebParam Long adharNum);
	
	@WebMethod
	public @WebResult Long adharEnroll(@WebParam Person person);
}
