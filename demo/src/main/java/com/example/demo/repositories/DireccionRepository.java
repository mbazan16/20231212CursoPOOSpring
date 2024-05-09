package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.data.Direccion;

public interface DireccionRepository extends CrudRepository<Direccion, Integer> {
	
	// Dinámica
	public Iterable<Direccion> findByIdPais(String idPais);
	
	// JPQL
	@Query("SELECT d FROM Direccion d WHERE d.idPais=:id")
	public Iterable<Direccion> seleccionarDireccionPais(String id);
	
	// Nativa
	@Query(value = "SELECT l.* FROM LOCATIONS l WHERE l.COUNTRY_ID=:id", nativeQuery = true)
	public Iterable<Direccion> seleccionDireccionPaisNativo(String id);
	
	//NameQuery	
	public Iterable<Direccion> seleccionPorPaisNamed(String id);

}
