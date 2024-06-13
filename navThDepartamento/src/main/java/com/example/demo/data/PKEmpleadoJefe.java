package com.example.demo.data;

import jakarta.persistence.Embeddable;

@Embeddable
public class PKEmpleadoJefe {

	private int empleadoId;	
	private int jefeId;
		
	public PKEmpleadoJefe() {
		super();
	}
	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}
	public int getJefeId() {
		return jefeId;
	}
	public void setJefeId(int jefeId) {
		this.jefeId = jefeId;
	}
	
	
	
}
