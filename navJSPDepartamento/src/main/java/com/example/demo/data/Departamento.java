package com.example.demo.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class Departamento {

	@Id
	@Column(name="DEPARTMENT_ID")
	private int id;

	@Column(name="DEPARTMENT_NAME")
	private String nombre;

	@Column(name="IDGERENTE")//MANAGER_ID")
	private Integer idGerente;
	
	@ManyToOne(optional=true)
	@JoinColumn(name="LOCATION_ID")
	private Direccion direccion;

	public Departamento() {

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

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", idGerente=" + idGerente + ", direccion=" + direccion
				+ "]";
	}

	

	

}
