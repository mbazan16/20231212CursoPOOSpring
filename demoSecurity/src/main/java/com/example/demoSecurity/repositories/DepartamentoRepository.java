package com.example.demoSecurity.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demoSecurity.data.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{

	@Query("SELECT d FROM Departamento d WHERE upper(d.nombre) LIKE concat('%',:nombre,'%')")
	List<Departamento> findByNameLike(@Param("nombre")String nombre);

}
