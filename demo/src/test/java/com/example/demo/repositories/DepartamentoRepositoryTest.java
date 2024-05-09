package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.data.Departamento;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DepartamentoRepositoryTest {

	public static final Logger log = LoggerFactory.getLogger(DepartamentoRepositoryTest.class);

	@Autowired
	DepartamentoRepository repository;

	@Test
	@DisplayName("ConsultaPorNombreLike")
	void testConsultaPorNombreLike() {

		log.info("testConsultaPorNombreLike");

		List<Departamento> departamentos = repository.findByNameLike("CO");

		for (Departamento departamento : departamentos) {

			log.info(departamento.toString());
		}
		assertNotNull(departamentos);
	}

}
