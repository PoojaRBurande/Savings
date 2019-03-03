package com.savings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.savings.services.LoginService;


@RestController
public class RestControllerCommon {

	@RequestMapping(value="/balance" , method = RequestMethod.GET)
	public String checkBalance(){
		System.out.println("balance");
		return "30058";
	}
	
	@RequestMapping(value="/deposit" , method = RequestMethod.GET)
	public String checkDeposit(){
		System.out.println("deposit");
		String deposit="5003";
		return deposit;
	}

}
