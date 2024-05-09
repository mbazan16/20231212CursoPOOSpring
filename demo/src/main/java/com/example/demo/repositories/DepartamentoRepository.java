package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.data.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento, Integer>{

	@Query("SELECT d FROM Departamento d WHERE upper(d.nombre) LIKE concat('%',:nombre,'%')")
	List<Departamento> findByNameLike(@Param("nombre")String nombre);

}
