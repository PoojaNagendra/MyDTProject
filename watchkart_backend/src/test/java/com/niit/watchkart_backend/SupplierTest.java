
package com.niit.watchkart_backend;

import java.util.List;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchkart_backend.Dao.SupplierDao;
import com.niit.watchkart_backend.model.Supplier;





public class SupplierTest {
	public static void main(
		String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.watchkart_backend");
		ctx.refresh();
		System.out.println("Done");
		
		SupplierDao sd=(SupplierDao) ctx.getBean("supplierDao");
		List<Supplier> lst=sd.getAll();
		
		
		
	}

}