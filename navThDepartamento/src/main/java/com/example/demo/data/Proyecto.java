package com.example.demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
	@Id
	private int id;
	private String nombre;
	public Proyecto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
