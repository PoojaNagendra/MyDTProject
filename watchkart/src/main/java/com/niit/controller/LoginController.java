package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.watchkart_backend.model.Users;

@Controller

public class LoginController {

	@Autowired
	Users users;
	
	@RequestMapping("/testlog")
	   public String getsignedIn() {
	   	System.out.println("DONEEEEEEEEEEEEEEEEEEEEEEEEE");
		   return "testLog";
	   }
	@RequestMapping("/userview")
	public String getUserview(){
		return "user-landing";
	}
	 @RequestMapping("/logins")
		public String getLog()
		{
			return "signin";
		}
	 @RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
		public ModelAndView defaultPage() {
		 	System.out.println("Don1111111111111111111111");
			ModelAndView model = new ModelAndView("index");
			System.out.println("Don222222222222222222222222");
			return model;

		}
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
		public ModelAndView getLogin(@RequestParam(value = "error", required = false) String error,
				@RequestParam(value = "logout", required = false) String logout) {
		 		System.out.println("login page");
			ModelAndView model = new ModelAndView();
			if (error != null) {
				model.addObject("error", "Invalid username and password!");
				System.out.println("Error");
				model.setViewName("signin");
			}

			else if (logout != null) {
				model.addObject("msg", "you have loggedout successfully");
				System.out.println("LogOut");
				model.setViewName("index");
			}
			else
			{
				System.out.println("some error");
			model.setViewName("UserTable");
			}
			return model;

		}

}
