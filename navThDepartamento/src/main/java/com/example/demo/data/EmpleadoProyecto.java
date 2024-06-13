package com.example.demo.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(PKEmpleadoProyecto.class)
public class EmpleadoProyecto {	
	
	@Id
	@Column(name="empleadoid")
	private int empleadoId;
	@Id
	@Column(name="proyectoid")
	private int proyectoId;
	
	@Column(name="numhoras")
	private int numHoras;

	public EmpleadoProyecto(int numHoras) {
		super();
		this.numHoras = numHoras;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public int getProyectoId() {
		return proyectoId;
	}

	public void setProyectoId(int proyectoId) {
		this.proyectoId = proyectoId;
	}
	
	
}
