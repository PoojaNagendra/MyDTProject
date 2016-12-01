package com.niit.watchkart_backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.watchkart_backend.Dao.ProductDao;
import com.niit.watchkart_backend.model.Product;

public class ProTest {
	 public static void main(String[] args) {
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
			ctx.scan("com.niit.watchkart_backend");
			ctx.refresh();
			System.out.println("Done");
			
			ProductDao pd = (ProductDao) ctx.getBean("productDao");
			List<Product> plst=pd.getAll();
			System.out.println(plst.size());
		}
}
