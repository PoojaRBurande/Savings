package com.savings.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.savings.services.LoginService;

@Controller
@SessionAttributes("name")
public class MainController {

	// final static Logger logger = Logger.getLogger(MainController.class);
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response) {
		System.out
				.println("Entered Name: " + request.getParameter("inputName"));
		ModelAndView model = new ModelAndView("login");
		// checkLogger();
		return model;

	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String StaticError(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("in /error");
		return "redirect:/static/server.html";
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public ModelAndView validateLogin(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Entered Name: " + request.getParameter("id"));
		String name = request.getParameter("id");
		String pwd = request.getParameter("id");
		ModelAndView model=new ModelAndView();	
		boolean isUser = loginService.checkUser(name, pwd);
		if (isUser) {
			model.setViewName("home");
			model.addObject("name",name);
			model.addObject("sessionId", "pooja@3");
			return model;
		} else
			model.setViewName("login");
			model.addObject("message", "Id or Password Incorrect, please try again");
			return model;
	}
	
	@RequestMapping(value="/accountDetails" , method = RequestMethod.POST)
	public ModelAndView getAccountDetails(){
		ModelAndView model=new ModelAndView();
		model.setViewName("accountDetail");
		return model;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(){
		System.out.println("inlogout");
		ModelAndView model=new ModelAndView("login");
		model.addObject("message","Successfully logged out");
		return model;
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.GET)
	public String validateLogin() {
		System.out.println("in validate login GET method");
		throw new ApplicationException("Please login first");
	}

}
