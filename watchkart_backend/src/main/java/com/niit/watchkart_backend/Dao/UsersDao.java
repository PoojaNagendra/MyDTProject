package com.niit.watchkart_backend.Dao;

import java.util.List;

import com.niit.watchkart_backend.model.Users;

public interface UsersDao {
	Users getUsers(String uid,String pwd,String role);
	void insertORupdate(Users usr);
	void delUsers(String uid);
	List<Users> getAll();
	
}
