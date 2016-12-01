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
			Product product=(Product) ctx.getBean("product");
			product.setPid(5);
			product.setPname("Watch");
			pd.insertORupdate(product);
			
		}
}
