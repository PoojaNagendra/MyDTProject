package com.niit.watchkart_backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchkart_backend.Dao.UsersDao;
import com.niit.watchkart_backend.model.Users;

public class UsersTest {
   public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.watchkart_backend");
	ctx.refresh();
	System.out.println("Done");
		UsersDao ud=(UsersDao) ctx.getBean("usersDao");
	Users users=(Users) ctx.getBean("users");
	List<Users> lst=ud.getAll();
System.out.println(lst.size());
}
}