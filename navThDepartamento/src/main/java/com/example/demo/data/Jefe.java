package com.example.demo.data;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jefe extends DatoPersonal{
	@Id
	private int id;
	private boolean mcaCoche;
	
	@Embedded
	private DatosFinancieros datosFinancieros;
	
	public Jefe() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMcaCoche() {
		return mcaCoche;
	}

	public void setMcaCoche(boolean mcaCoche) {
		this.mcaCoche = mcaCoche;
	}

	public DatosFinancieros getDatosFinancieros() {
		return datosFinancieros;
	}

	public void setDatosFinancieros(DatosFinancieros datosFinancieros) {
		this.datosFinancieros = datosFinancieros;
	}

}
