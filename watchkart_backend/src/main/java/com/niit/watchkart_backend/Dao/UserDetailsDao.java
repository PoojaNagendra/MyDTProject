package com.niit.watchkart_backend.Dao;

import java.util.List;


import com.niit.watchkart_backend.model.UserDetails;
public interface UserDetailsDao {
	UserDetails getuserdetails(int uid);
	void insertORupdate(UserDetails userdetails);
	void delUserDetails(int uid);
	List<UserDetails> getAll();
}
