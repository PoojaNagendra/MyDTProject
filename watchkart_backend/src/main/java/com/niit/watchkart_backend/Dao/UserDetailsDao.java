package com.niit.watchkart_backend.Dao;

import java.util.List;


import com.niit.watchkart_backend.model.UserDetails;
public interface UserDetailsDao {
	UserDetails getuserdetails(String uid,String pwd,String name, String address, String phoneno, String remarks, String houseno, String street,String city, String pincode , String state, String country);
	void insertORupdate(UserDetails userdetails);
	void delUserDetails(String uid);
	List<UserDetails> getAll();
}
