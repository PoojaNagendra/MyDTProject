package com.niit.watchkart_backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchkart_backend.Dao.SupplierDao;
import com.niit.watchkart_backend.Dao.UserDetailsDao;
import com.niit.watchkart_backend.model.Supplier;
import com.niit.watchkart_backend.model.UserDetails;



//public class UserDetailsTest {
// public static void main(String[] args) {
//	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.scan("com.niit.watchkart_backend");
//		ctx.refresh();
//		
//		System.out.println("Done");
//		UserDetailsDao ud=(UserDetailsDao) ctx.getBean("userdetailsDao");
//		UserDetails userDetails=(UserDetails) ctx.getBean("userdetails");
////		userDetails.setName("ssss");
////		userDetails.setAddress("pppp");
////		userDetails.setPhoneno("1111");
////		userDetails.setUid("ddddd");
////		userDetails.setPwd("maa");
////		userDetails.setHouseno("5");
////		userDetails.setStreet("first");
////		userDetails.setCity("bangalore");
////		userDetails.setPincode("222");
////		userDetails.setState("karnataka");
////		userDetails.setCountry("India");
////		userDetails.setCart_id(1);
//		
////		ud.insertORupdate(userDetails);
////		
//		List<UserDetails> lst=ud.getAll();
//		System.out.println(lst.size());
//}
//}


public class UserDetailsTest {
	
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.watchkart_backend");
	ctx.refresh();
	System.out.println("DONEEEEEEEEEEEEEEEE");
	
	UserDetailsDao usrdt = (UserDetailsDao) ctx.getBean("userdetailsDao");
	System.out.println("222222222222222222222222222222222");
//	UserDetails userdetails = (UserDetails) ctx.getBean("userdetails");
//	userdetails.setId(1);
//	userdetails.setName("UUU");
//	userdetails.setNumber("12345");
//	userdetails.setState("aaa");
//	userdetails.setCountry("aaa");
//	userdetails.setCart_id(12);
//	usrdt.insertORupdate(userdetails);
	List<UserDetails> lst = usrdt.getAll();
//    System.out.println(lst.size());
	
}
}

