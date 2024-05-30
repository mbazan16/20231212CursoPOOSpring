package com.example.demoSecurity.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demoSecurity.admin.exception.AdminException;

@Component
public class Validation {
	public static final Logger log = LoggerFactory.getLogger(AdminDepartamentos.class);

	public static void hayPalabrotas(String cadena) throws AdminException{
		log.info("[hayPalabrotas]");
		if(cadena.contains("DROP")) throw new AdminException();
	}
}
