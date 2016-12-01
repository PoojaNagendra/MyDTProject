package com.niit.watchkart_backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchkart_backend.Dao.CartDao;
import com.niit.watchkart_backend.model.Cart;



public class CartTest {
 public static void main(String[] args) {
	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.watchkart_backend");
		ctx.refresh();
		
		System.out.println("Done");
		CartDao ud=(CartDao) ctx.getBean("cartDao");
		List<Cart> lst=ud.getAll();
		System.out.println(lst.size());
}
}
