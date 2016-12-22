package com.niit.watchkart_backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchkart_backend.Dao.CartDao;
import com.niit.watchkart_backend.model.Cart;
import com.niit.watchkart_backend.model.UserDetails;



public class CartTest {
 public static void main(String[] args) {
	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.watchkart_backend");
		ctx.refresh();
		
		System.out.println("Done");
//		CartDao ud=(CartDao) ctx.getBean("cartDao");
//		Cart cart=(Cart) ctx.getBean("cart");
//		cart.setCid(1);
//		cart.setProd_id(2);
//		cart.setProd_name("pen");
//		cart.setProd_price("450");
//		cart.setQuantity("890");
//		cart.setTotal_amount("780");
		
//		ud.insertORupdate(cart);  	
//		List<Cart> lst=ud.getAll();
//		List<Cart> lst1=ud.getAllbyUser("badal");
//		System.out.println(lst.size());
}
}
