package com.niit.controller;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;


import com.niit.watchkart_backend.model.UserDetails;


@Component
public class FlowHandler {

	public UserDetails initFlow(){
		return new UserDetails();
	}
	
	public String validateDetails(UserDetails userDetails,MessageContext messageContext){
		String status = "success";
		
		if(userDetails.getName().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"name").defaultText("Name cannot be Empty").build());
			status = "failure";
		}
		if(userDetails.getPhoneno().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"phoneno").defaultText("number cannot be Empty").build());
			status = "failure";
		}
		if(userDetails.getAddress().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"address").defaultText("Address cannot be Empty").build());
			status = "failure";
		}
		if(userDetails.getCountry().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"country").defaultText("Address cannot be Empty").build());
			status = "failure";
		}
		if(userDetails.getState().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"state").defaultText("Address cannot be Empty").build());
			status = "failure";
		}
		return status;
	}
}

