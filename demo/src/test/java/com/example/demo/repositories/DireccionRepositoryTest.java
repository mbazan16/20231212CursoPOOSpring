package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.data.Direccion;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DireccionRepositoryTest {

	public static final Logger log = LoggerFactory.getLogger(DireccionRepositoryTest.class);

	@Autowired
	DireccionRepository repository;

	@Test
	@DisplayName("ConsultaDinamica")
	void testConsultaDinamica() {

		log.info("Direcciones DINAMICA");

		Iterable<Direccion> direcciones = repository.findByIdPais("US");

		for (Direccion direccion : direcciones) {

			log.info(direccion.toString());
		}
		assertNotNull(direcciones);
	}
	
	@Test
	@DisplayName("ConsultaJPQL")
	void testConsultaJPQL() {

		log.info("DIRECCIONES JPQL");

		Iterable<Direccion> direcciones = repository.seleccionarDireccionPais("US");

		for (Direccion direccion : direcciones) {

			log.info(direccion.toString());
		}
		assertNotNull(direcciones);
	}
	
	@Test
	@DisplayName("ConsultaNativa")
	void testConsultaNativa() {
		
		log.info("DIRECCIONES NATIVA");
		Iterable<Direccion> direcciones = repository.seleccionDireccionPaisNativo("US");
		
		for (Direccion direccion : direcciones) {
			log.info(direccion.toString());
		}
		assertNotNull(direcciones);
		// assertEquals(2+3,5);
	}
	
	@Test
	@DisplayName("ConsultaName")
	void testConsultaName() {
		
		log.info("DIRECCIONES NAME");
		Iterable<Direccion> direcciones = repository.seleccionPorPaisNamed("US");
		
		for (Direccion direccion : direcciones) {
			log.info(direccion.toString());
		}
		assertNotNull(direcciones);
		// assertEquals(2+3,5);
	}

}
