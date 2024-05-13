package com.example.demo.controllers.admin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.admin.IAdminDepartamentos;
import com.example.demo.admin.exception.AdminException;
import com.example.demo.data.Departamento;

@Controller
@RequestMapping("/buscador")
public class BuscadorDepartamentoController {
	public static final Logger log = LoggerFactory.getLogger(BuscadorDepartamentoController.class);
	
	@Autowired
	IAdminDepartamentos servicio;
	
	@GetMapping
	public String buscador(Model model,@RequestParam("cadena") String cadena) throws AdminException{
		log.info("[buscador]");
		log.debug("[cadena:"+cadena+"]");
		List<Departamento> departamentos= servicio.buscador(cadena);	
		model.addAttribute("listaDepartamentos", departamentos);
		return "t_inicio";
	}
	

}
