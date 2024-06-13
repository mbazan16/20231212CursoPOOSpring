package com.example.demo.data;

import jakarta.persistence.Embeddable;

@Embeddable
public class DatosFinancieros {
	
	private float salary;
	private float commision;
	
	public DatosFinancieros() {
		super();
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getCommision() {
		return commision;
	}

	public void setCommision(float commision) {
		this.commision = commision;
	}

	
	
	

}
