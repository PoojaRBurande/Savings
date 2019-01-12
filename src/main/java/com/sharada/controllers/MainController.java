package com.sharada.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	final static Logger logger = Logger.getLogger(MainController.class);
	
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	public ModelAndView  login(HttpServletRequest request, HttpServletResponse response){
		System.out.println("Entered Name: "+request.getParameter("inputName"));
		ModelAndView  model=new ModelAndView("login"); 
		checkLogger();
		return model;
		
	}
	
	private void checkLogger() {
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
	}

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
}
