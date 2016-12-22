package com.niit.watchkart_backend.Dao;

import java.util.List;

import com.niit.watchkart_backend.model.Users;

public interface UsersDao {
	Users getUsers(int uid);
	void insertORupdate(Users usr);
	void delUsers(int uid);
	List<Users> getAll();
	
}
