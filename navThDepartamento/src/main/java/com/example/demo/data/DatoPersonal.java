package com.example.demo.data;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class DatoPersonal {
	
	protected String nombre;
	protected String apellidos;	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
