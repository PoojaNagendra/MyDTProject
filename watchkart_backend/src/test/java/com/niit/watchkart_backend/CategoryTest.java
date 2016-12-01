
package com.niit.watchkart_backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchkart_backend.Dao.CategoryDao;
import com.niit.watchkart_backend.model.Category;


public class CategoryTest {
	public static void main(
		String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.watchkart_backend");
		ctx.refresh();
		
		System.out.println("Done");
		CategoryDao ud=(CategoryDao) ctx.getBean("categoryDao");
		List<Category> lst=ud.getAll();
		System.out.println(lst.size());
	}

}