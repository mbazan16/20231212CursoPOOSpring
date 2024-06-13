package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
	public static final Logger log = LoggerFactory.getLogger(ErrorController.class);
	
	
	@GetMapping
	public String error() {
		log.info("[error]");	
		return "t_cualquiera";
	}

}
