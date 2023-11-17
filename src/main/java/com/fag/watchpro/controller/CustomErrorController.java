package com.fag.watchpro.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController implements ErrorController {
   private final Logger logger = LoggerFactory.getLogger(CustomErrorController.class);
   
	public String getErrorPath() {
		return "/error";
	}
	
	@GetMapping("/error")
	public ModelAndView handleError(HttpServletRequest response) {
		
		HttpStatus code = ((ModelAndView) response).getStatus();
    	System.out.println("Error with status code " + code + " happened !");
    	
    	logger.error("Error with status code {}  happened. Support! Do something !", code);
	    return new ModelAndView("error");
	}
}