package com.BikkadIT.ControllerToUI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcomeMessage")
	public ModelAndView welcomeMessage() {
		
	String welmsg="Welcome to BIKKADIT";
	
	ModelAndView mav=new ModelAndView();
	mav.addObject("MSG",welmsg);
	mav.setViewName("message");
	return mav;
		
	}
}
