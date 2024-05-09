package com.example.demo.admin;

import java.util.List;

import com.example.demo.admin.exception.AdminException;
import com.example.demo.data.Departamento;
import com.example.demo.data.Direccion;

public interface IAdminDepartamentos {
	//Para buscar departamento
	public List<Departamento> buscador(String nombreDepartamento)throws AdminException;
	
	//Para el detalle del departamento
	public Departamento detalleDepartamento(String nombreDepartamento);
	
	public Departamento detalleDepartamento(int idDepartamento);
	
	//Para crear departamento
	public List<Direccion> listaDirecciones();
	
	public void crearDepartamento(Departamento departamento);
	
	public void crearDepartamento(String nombreDepartamento, Direccion direccion);
	
	//Para modificar departamento
	public void modificarDepartamento(Departamento departamento);
	

}
