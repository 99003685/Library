package com.ltts.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String email;
private String mobile;
private String name;
private String dateofbirth;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Long id, String email, String mobile, String name, String dateofbirth) {
	super();
	this.id = id;
	this.email = email;
	this.mobile = mobile;
	this.name = name;
	this.dateofbirth = dateofbirth;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}


}
