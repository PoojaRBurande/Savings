package com.savings.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	//final static Logger logger = Logger.getLogger(MainController.class);
	
	@RequestMapping(value="/" , method = RequestMethod.GET)
	public ModelAndView  login(HttpServletRequest request, HttpServletResponse response){
		System.out.println("Entered Name: "+request.getParameter("inputName"));
		ModelAndView  model=new ModelAndView("login"); 
		//checkLogger();
		return model;
		
	}
	
	@RequestMapping(value="/error" , method = RequestMethod.GET)
	public String StaticError(HttpServletRequest request, HttpServletResponse response){
		System.out.println("in /error");
		return "redirect:/static/server.html";
	}
	
	/*private void checkLogger() {
		String parameter="logging..";
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
	}*/

	@RequestMapping(value="/validateLogin" , method = RequestMethod.POST)
	public ModelAndView  validateLogin(HttpServletRequest request, HttpServletResponse response){
		System.out.println("Entered Name: "+request.getParameter("inputName"));
		String name=request.getParameter("inputName");
		if(name=="pooja" || name.equalsIgnoreCase("pooja"))
		{
			ModelAndView  model=new ModelAndView("home");
			model.addObject("nameEntered", name);
			return model;
		}
		else{
			ModelAndView  model=new ModelAndView("login");
			model.addObject("invalid", "Invalid Login Id or Password "+name);
			return model;
		}
		
	}
	@RequestMapping(value="/validateLogin" , method = RequestMethod.GET)
	public String  validateLogin(){
		System.out.println("in validate login GET method");
		throw new ApplicationException("Please login first");
	}
	@RequestMapping(value="/balance" , method = RequestMethod.GET)
	public @ResponseBody String checkBalance(){
		System.out.println("balance");
		String balance="5003";
		return balance;
	}
	
	@RequestMapping(value="/deposit" , method = RequestMethod.GET)
	public @ResponseBody String checkDeposit(){
		System.out.println("deposit");
		String deposit="5003";
		return deposit;
	}
}
