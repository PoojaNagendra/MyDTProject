package com.niit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.watchkart_backend.Dao.ProductDao;
import com.niit.watchkart_backend.model.Product;


@Controller
public class ProductController {

	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	
	
	    

	
	@RequestMapping("getProduct")
	public ModelAndView getAllPro()
	{
//		ModelAndView mv=new ModelAndView("proList");
		ModelAndView mv=new ModelAndView("ProTable");
		return mv;
	}
	@RequestMapping("GsonCon")
	public @ResponseBody String listProduct() {
	 String pro="";
	 System.out.println("PPPPPP PPPPPP PPPPPPP");
		
		Product prod=null;
		Gson gson=null;
		List<Product> listPro = productDao.getAll();
		
			
			gson=new Gson();
			pro=gson.toJson(listPro);
			  System.out.println("PPPPPP PPPPPP PPPPPPP"+listPro.size());
	 
	    return pro;
	}
}

