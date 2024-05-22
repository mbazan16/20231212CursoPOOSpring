package com.example.demo.admin;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.admin.exception.AdminException;
import com.example.demo.data.Departamento;
import com.example.demo.data.Direccion;
import com.example.demo.repositories.DepartamentoRepository;
import com.example.demo.repositories.DireccionRepository;

@Service
public class AdminDepartamentos implements IAdminDepartamentos {

	public static final Logger log = LoggerFactory.getLogger(AdminDepartamentos.class);

	@Autowired
	DepartamentoRepository repository;

	@Autowired
	DireccionRepository repositoryDirecciones;

	@Override
	public List<Departamento> buscador(String nombreDepartamento) throws AdminException {
		log.info("[buscador]");
		log.debug("[nombreDepartamento:" + nombreDepartamento + "]");

		List<Departamento> departamentos = new ArrayList<Departamento>();
		try {

			if (nombreDepartamento == null)
				nombreDepartamento = "";

			// La propia logica de negocio
			nombreDepartamento = nombreDepartamento.trim().toUpperCase();
			departamentos = repository.findByNameLike(nombreDepartamento);
			departamentos.forEach(s -> log.debug(s.toString()));
		} catch (Exception e) {
			log.error("Exception", e);
			throw new AdminException();
		}
		return departamentos;
	}

	@Override
	public Departamento detalleDepartamento(String nombreDepartamento) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento detalleDepartamento(int idDepartamento) throws AdminException {
		log.info("[detalleDepartamento]");
		log.debug("[idDepartamento:" + idDepartamento + "]");

		Departamento departamento= null;
		try {

			departamento = repository.findById(idDepartamento).get();
			
		} catch (Exception e) {
			log.error("Exception", e);
			throw new AdminException();
		}
		return departamento;
	}

	@Override
	public List<Direccion> listaDirecciones() throws AdminException {
		log.info("[listaDirecciones]");

		List<Direccion> direcciones = new ArrayList<Direccion>();
		try {
			direcciones = repositoryDirecciones.findAll();

		} catch (Exception e) {
			log.error("Exception", e);
			throw new AdminException();
		}
		return direcciones;
	}

	@Override
	public void crearDepartamento(Departamento departamento) throws AdminException {
		log.info("[crearDepartamento]");

		try {
			validar(departamento);
			//se invocaria a un a otro servidor 
			repository.save(departamento);

		} catch (AdminException ae) {
			log.error("AdminException", ae);
			throw ae;
		} catch (Exception e) {
			log.error("Exception", e);
			throw new AdminException();
		}

	}

	@Override
	public void crearDepartamento(String nombreDepartamento, Direccion direccion) throws AdminException {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificarDepartamento(Departamento departamento) throws AdminException {
		log.info("[modificarDepartamento]");

		try {
			validar(departamento);
			//se invocaria a un a otro servidor 
			repository.save(departamento);

		} catch (AdminException ae) {
			log.error("AdminException", ae);
			throw ae;
		} catch (Exception e) {
			log.error("Exception", e);
			throw new AdminException();
		}

	}

	private void validar(Departamento departamento)throws AdminException {
		log.info("[validar]");
		log.debug("[departamento:"+departamento+"]");
		if(departamento == null) throw new AdminException();
		if(departamento.getNombre() == null) throw new AdminException();
		departamento.setNombre(departamento.getNombre().trim().toUpperCase());
		if(departamento.getNombre().isEmpty()) throw new AdminException();
		Validation.hayPalabrotas(departamento.getNombre());
	}

}
