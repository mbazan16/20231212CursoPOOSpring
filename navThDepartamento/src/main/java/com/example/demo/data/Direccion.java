package com.example.demo.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="LOCATIONS")
@NamedQuery(name="Direccion.seleccionPorPaisNamed",query = "SELECT d FROM Direccion d WHERE d.idPais=:id")
public class Direccion {

	@Id
	@Column(name="LOCATION_ID")
	private int id;
	
	@Column(name="STREET_ADDRESS")
	private String calle; 
	
	@Column(name="POSTAL_CODE")
	private String codigoPostal;
	
	 @Column(name="CITY")
	 private String ciudad;
	 
	 @Column(name="STATE_PROVINCE")
	 private String provincia;
	 
	 @Column (name="COUNTRY_ID")
	 private String idPais;
	 
	 public Direccion() {
		 super();
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getIdPais() {
		return idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}
	

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad
				+ ", provincia=" + provincia + ", idPais=" + idPais + "]";
	}
	
	
	 
	
}
