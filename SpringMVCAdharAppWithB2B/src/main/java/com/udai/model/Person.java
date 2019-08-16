package com.udai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Person_data")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	@XmlElement(name="adhar-num")
	private Long adharNum;
	@Column(length = 20)
	@XmlElement(name="first-name")
	private String firstName;
	@Column(length = 20)
	@XmlElement(name="last-name")
	private String lastName;
	private Integer age;
	@Column(length = 30)
	private String email;
	@Column(length = 7)
	private String gender;
	@Column(length = 12)
	@XmlElement(name="phone-no")
	private String phoneNo;
	
}
