package com.niit.watchkart_backend.Dao;

import java.util.List;

import com.niit.watchkart_backend.model.Category;

public interface CategoryDao {

	Category getCategory(String cid,String cname);
	void insertORupdate(Category cat);
	void delCategory(String cid);
	List<Category> getAll();
}