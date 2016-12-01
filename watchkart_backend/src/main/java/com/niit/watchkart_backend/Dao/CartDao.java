package com.niit.watchkart_backend.Dao;

import java.util.List;

import com.niit.watchkart_backend.model.Cart;
public interface CartDao {
	Cart getcart(String cid,String prod_id,String prod_price, String quantity, String total_amount);
	void insertORupdate(Cart cart);
	void delCart(String cid);
	List<Cart> getAll();
}
