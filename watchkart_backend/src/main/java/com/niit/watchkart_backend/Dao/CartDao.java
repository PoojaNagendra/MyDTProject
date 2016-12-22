package com.niit.watchkart_backend.Dao;

import java.util.List;

import com.niit.watchkart_backend.model.Cart;
public interface CartDao {
	Cart getcart(int cid);
	void insertORupdate(Cart cart);
	void delCart(int cid);
	List<Cart> getAll();
	List<Cart> getAllbyUser(String usr);
	
}
