package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.data.Departamento;

@DataJpaTest
//Si se quiere hacer las pruebas con otra bbdd que no sea H2, hay que indeicar la siguiente anotación:
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DepartamentoRepositoryTest {

	Logger log = LoggerFactory.getLogger(DepartamentoRepositoryTest.class);
	
	@Autowired
	DepartamentoRepository repository;
	
	@BeforeEach
	public void antesCadaTest() {
		log.debug("---------EMPIEZA EJECUCIÓN DE TEST----------");
	}
	
	@Test
	@DisplayName("findByNameLike - encuentra departamentos")
	void testfindByNameLikeOk() {
		List<Departamento> departamentos = repository.findByNameLike("DEVELOP");
		assertEquals(1, departamentos.size());
		assertEquals("DEVELOPMENT",departamentos.get(0).getNombre());	
		
	}
	
	@Test
	@DisplayName("findByNameLike - no encuentra departamentos")
	void testfindByNameLikeNoElement() {
		List<Departamento> departamentos = repository.findByNameLike("XX");
		assertEquals(0, departamentos.size());
		assertEquals(true,departamentos.isEmpty());	
		
	}
	
	@AfterEach
	public void despuesCadaTest() {
		log.debug("---------TERMINA EJECUCIÓN DE TEST----------");
	}

}
