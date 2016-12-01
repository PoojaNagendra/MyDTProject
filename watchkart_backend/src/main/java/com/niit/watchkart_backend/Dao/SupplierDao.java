package com.niit.watchkart_backend.Dao;

import java.util.List;

import com.niit.watchkart_backend.model.Supplier;


public interface SupplierDao {

	Supplier getSupplier(String sid,String sname,String saddress);
	void insertORupdate(Supplier sup);
	void delSupplier(String sid);
	List<Supplier> getAll();
}