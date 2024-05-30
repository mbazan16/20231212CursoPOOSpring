package com.example.demoSecurity.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demoSecurity.controllers.admin.BuscadorDepartamentoController;

@Controller
public class LoginController {
	public static final Logger log = LoggerFactory.getLogger(BuscadorDepartamentoController.class);
	
	@RequestMapping("/login")
	public String login() {
		log.info("login");
		
		return "t_login";
		
	}
	
	@RequestMapping("/loginError")
	public String loginError(Model model) {
		log.info("loginError");
		model.addAttribute("error", "Login Incorrecto");
		return "t_login";
		
	}
	
	@RequestMapping("/accessDenied")
	public String accessDenied(Model model) {
		log.info("accessDenied");
		model.addAttribute("error", "Acceso denegado");
		return "t_accessDenied";
		
	}

}
