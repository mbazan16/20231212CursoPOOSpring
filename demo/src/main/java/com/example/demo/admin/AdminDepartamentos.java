package com.example.demo.admin;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.admin.exception.AdminException;
import com.example.demo.admin.exception.NombreDepartamentoInvalidoException;
import com.example.demo.data.Departamento;
import com.example.demo.data.Direccion;
import com.example.demo.repositories.DepartamentoRepository;

@Service
public class AdminDepartamentos implements IAdminDepartamentos{
	
	public static final Logger log = LoggerFactory.getLogger(AdminDepartamentos.class);
	
	@Autowired
	DepartamentoRepository repository;

	@Override
	public List<Departamento> buscador(String nombreDepartamento) throws AdminException {
		log.info("[buscador]");
		log.debug("[nombreDepartamento:"+nombreDepartamento+"]");
		
		List<Departamento> departamentos = new ArrayList<Departamento>();
		try {
			//Validacion de parametros
			if(nombreDepartamento == null || nombreDepartamento.trim().isEmpty())
				throw new NombreDepartamentoInvalidoException();
			//La propia logica de negocio
			nombreDepartamento = nombreDepartamento.trim().toUpperCase();
			departamentos = repository.findByNameLike(nombreDepartamento);
			departamentos.forEach(d -> log.debug(d.toString()));
		}catch(AdminException ae) {
			log.error("AdminException", ae);
			throw ae;
		} catch (Exception e) {
			log.error("Exception", e);
			throw new AdminException();
		}
		return departamentos;
	}

	@Override
	public Departamento detalleDepartamento(String nombreDepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento detalleDepartamento(int idDepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Direccion> listaDirecciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearDepartamento(String nombreDepartamento, Direccion direccion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	
	

}
