package com.example.demoSecurity.controllers.admin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demoSecurity.admin.IAdminDepartamentos;
import com.example.demoSecurity.admin.exception.AdminException;
import com.example.demoSecurity.data.Departamento;
import com.example.demoSecurity.data.Direccion;

@Controller
@RequestMapping("/departamento")
public class VisualizarDepartamentoController {
	public static final Logger log = LoggerFactory.getLogger(VisualizarDepartamentoController.class);
	
	@Autowired
	IAdminDepartamentos servicio;
	
	@PostMapping
	public String crear(Model model,@ModelAttribute Departamento departamento) throws AdminException{
		log.info("[crear]");
		log.debug("[departamento:"+departamento+"]");			
				
		servicio.crearDepartamento(departamento);
		//La siguiente linea no sería necesaria, es para asegurarse que la información esta en la bbdd
		departamento= servicio.detalleDepartamento(departamento.getId());
		
		model.addAttribute("dep", departamento);
		List<Direccion> direcciones= servicio.listaDirecciones();
		model.addAttribute("listaDirecciones",direcciones);
		return "t_departamento";
	}
	

}
