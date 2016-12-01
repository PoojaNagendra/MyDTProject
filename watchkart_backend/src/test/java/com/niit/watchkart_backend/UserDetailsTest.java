package com.niit.watchkart_backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.watchkart_backend.Dao.UserDetailsDao;
import com.niit.watchkart_backend.model.UserDetails;



public class UserDetailsTest {
 public static void main(String[] args) {
	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.watchkart_backend");
		ctx.refresh();
		
		System.out.println("Done");
		UserDetailsDao ud=(UserDetailsDao) ctx.getBean("userdetailsDao");
		UserDetails userDetails=(UserDetails) ctx.getBean("userDetails");
		userDetails.setName("ssss");
		userDetails.setAddress("pppp");
		userDetails.setPhoneno("1111");
		userDetails.setUid("ddddd");
		userDetails.setPwd("maa");
		userDetails.setHouseno("5");
		userDetails.setStreet("first");
		userDetails.setCity("bangalore");
		userDetails.setPincode("222");
		userDetails.setState("karnataka");
		userDetails.setCountry("India");
		
		ud.insertORupdate(userDetails);
//		List<UserDetails> lst=ud.getAll();
//		System.out.println(lst.size());
}
}
