package com.example.demo.data;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Empleado extends DatoPersonal{
	@Id
	private int id;
	
	@Embedded
	private DatosFinancieros datosFinancieros;
	
	
	public Empleado() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DatosFinancieros getDatosFinancieros() {
		return datosFinancieros;
	}

	public void setDatosFinancieros(DatosFinancieros datosFinancieros) {
		this.datosFinancieros = datosFinancieros;
	}

	
	
	
	
	

}
