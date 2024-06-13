package com.example.demo.data;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class EmpleadoJefe {
	
	@EmbeddedId
	private PKEmpleadoJefe id;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate fechaInicio;
	
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date fechaFin;

	public EmpleadoJefe() {
		super();
	}

	public PKEmpleadoJefe getId() {
		return id;
	}

	public void setId(PKEmpleadoJefe id) {
		this.id = id;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	

}
