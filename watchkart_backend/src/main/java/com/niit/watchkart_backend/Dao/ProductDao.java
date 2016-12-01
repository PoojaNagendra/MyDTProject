package com.niit.watchkart_backend.Dao;

import java.util.List;

import com.niit.watchkart_backend.model.Product;

public interface ProductDao {
	Product getProduct(int pid,String pname,String pprice,String pcategoryid, String pstatus,String poffer,String psupplierid);
	void insertORupdate(Product pro);
	void delProduct(int pid);
	List<Product> getAll();
}
