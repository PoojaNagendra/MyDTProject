package com.niit.watchkart_backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Users {
  @Id
  private int uid;
  private String pwd;
  private String role;
  
public synchronized int getUid() {
	return uid;
}
public synchronized void setUid(int uid) {
	this.uid = uid;
}
public synchronized String getPwd() {
	return pwd;
}
public synchronized void setPwd(String pwd) {
	this.pwd = pwd;
}
public synchronized String getRole() {
	return role;
}
public synchronized void setRole(String role) {
	this.role = role;
}
}