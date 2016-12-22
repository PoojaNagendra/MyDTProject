package com.niit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.niit.watchkart_backend.Dao.CategoryDao;
import com.niit.watchkart_backend.Dao.ProductDao;
import com.niit.watchkart_backend.Dao.SupplierDao;
import com.niit.watchkart_backend.Dao.UserDetailsDao;
import com.niit.watchkart_backend.model.Category;
import com.niit.watchkart_backend.model.Product;
import com.niit.watchkart_backend.model.Supplier;
import com.niit.watchkart_backend.model.UserDetails;


@Controller
public class ProductController {

	
	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	
	@Autowired
    UserDetails userDetails;
	  
	@Autowired
	UserDetailsDao userDetailsDao;
	    
    @Autowired
    Supplier supplier;
    
    @Autowired
    SupplierDao supplierDao;
    
    @Autowired
    Category category;
    
    @Autowired
    CategoryDao categoryDao;

   
    
    @RequestMapping("returnback")
    public String getAdmin()
    {
  	  return "admin";
    }
    
    
    @RequestMapping("Landing")
    public String getLanding()
    {
  	  return "Landing";
    }
	
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
	
	@RequestMapping("getUser")
	public ModelAndView getAllUser()
	{
//		ModelAndView mv=new ModelAndView("proList");
		ModelAndView mv=new ModelAndView("UserDetailsTable");
		return mv; 
	}
	
	@RequestMapping("GsonCon1")
	public @ResponseBody String listUserDetails() {
	 String userdetails="";
	 System.out.println("PPPPPP PPPPPP PPPPPPP");
		
		UserDetails userdetails1=null;
		Gson gson=null;
		List<UserDetails> listUserDetails1= userDetailsDao.getAll();
		
			
			gson=new Gson();
			userdetails=gson.toJson(listUserDetails1);
			  System.out.println("PPPPPP PPPPPP PPPPPPP"+listUserDetails1.size());
	 
	    return userdetails;
	}

	 @RequestMapping ("getCategory")
		public ModelAndView getCategory1()
		{
			ModelAndView mv = new ModelAndView("CatTable");
			Category category = new Category(); 
		mv.addObject("order",category);	
			return mv;
		}

	
	@RequestMapping("CatTable")
	public String getCategory(){
		return "CatTable";
	}
//	
//	@RequestMapping("returnback")
//	public String getback(){
//		System.out.println("getting into controller");
//		return "admin";
//	}


	@RequestMapping("addcategory")
	public String storecate(@ModelAttribute("order")Category category,final RedirectAttributes redirectAttributes){
//				redirectAttributes.addAttribute("message","true");
//				redirectAttributes.addAttribute("ship",userdetails);
		
		categoryDao.insertORupdate(category);
		System.out.println("Done");
		return "redirect:/admin";
	}
	
	
	
	

	@RequestMapping("getSup")
	public ModelAndView getAllSup()
	{
//		ModelAndView mv=new ModelAndView("proList");
		ModelAndView mv=new ModelAndView("SupTable");
		Supplier supplier = new Supplier();
		return mv;
	}
	@RequestMapping("GsonCon2")
	public @ResponseBody String listSupplier() {
	 String supplier="";
	 System.out.println("PPPPPP PPPPPP PPPPPPP");
		
		Supplier sup=null;
		Gson gson=null;
		List<Supplier> listSupplier= supplierDao.getAll();
		
			
			gson=new Gson();
			supplier=gson.toJson(listSupplier);
			  System.out.println("PPPPPP PPPPPP PPPPPPP"+listSupplier.size());
	 
	    return supplier;
	}

	
	
	
	 @RequestMapping("sdelS")
	 public String getSupplierDel(@ModelAttribute("supplier") Supplier supplier,@RequestParam(value="val",required=false,defaultValue="")String sid,final RedirectAttributes redirectAttributes)
	 
	 {
		 supplierDao.delSupplier(sid);
		 System.out.println("deleted"+sid);
		 return "redirect:/getSup";
	 }
//		@RequestMapping ("SupTable")
//		public String getSupplierTable()
//		{
//			return "SupTable";
//		}

      @RequestMapping("sdelU")
     public String getUserdetailsDel(@ModelAttribute("userdetails") UserDetails userdetails,@RequestParam(value="val",required=false,defaultValue="")int uid, final RedirectAttributes redirectAttributes)
 {
     userDetailsDao.delUserDetails(uid);   	 
	 System.out.println("deleted" + uid);
	 return "redirect:/getUser";
 }

//   @RequestMapping("UserDetailsTable")
//   public String getUserdetailsTable(){
//	   return "UserDetailsTable";
//   }
	
//      @RequestMapping("sdelU")
//  	public String getSdel(@ModelAttribute("userdetails") UserDetails userdetails,
//  			@RequestParam(value = "val", required = false, defaultValue = "") int uid,
//  			final RedirectAttributes redirectAttributes) {
//
//    	  userDetailsDao.delUserDetails(uid);
//  		System.out.println("deleted " + uid);
//
//  		return "redirect:/getUser";
//
//  	}
      
      
      
}