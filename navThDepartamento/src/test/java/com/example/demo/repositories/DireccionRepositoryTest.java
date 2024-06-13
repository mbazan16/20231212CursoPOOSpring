package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.data.Direccion;

@DataJpaTest
@Transactional
@Rollback
public class DireccionRepositoryTest {

	Logger log = LoggerFactory.getLogger(DepartamentoRepositoryTest.class);
	
    @Autowired
    private DireccionRepository direccionRepository;

    @BeforeEach
	public void antesCadaTest() {
		log.debug("---------EMPIEZA EJECUCIÓN DE TEST----------");
	}
   
    @Test
    void testFindByIdPais() {
        List<Direccion> direcciones = (List<Direccion>) direccionRepository.findByIdPais("US");

        assertNotNull(direcciones);
        assertEquals(5, direcciones.size());
        assertEquals("US", direcciones.get(0).getIdPais());
    }

    @Test
    void testSeleccionarDireccionPais() {
        List<Direccion> direcciones = (List<Direccion>) direccionRepository.seleccionarDireccionPais("US");

        assertNotNull(direcciones);
        assertEquals(5, direcciones.size());
        assertEquals("US", direcciones.get(0).getIdPais());
    }

    @Test
    void testSeleccionDireccionPaisNativo() {
        List<Direccion> direcciones = (List<Direccion>) direccionRepository.seleccionDireccionPaisNativo("US");

        assertNotNull(direcciones);
        assertEquals(5, direcciones.size());
        assertEquals("US", direcciones.get(0).getIdPais());
    }

    @Test
    void testSeleccionPorPaisNamed() {
        List<Direccion> direcciones = (List<Direccion>) direccionRepository.seleccionPorPaisNamed("US");

        assertNotNull(direcciones);
        assertEquals(5, direcciones.size());
        assertEquals("US", direcciones.get(0).getIdPais());
    }
    
    @AfterEach
	public void despuesCadaTest() {
		log.debug("---------TERMINA EJECUCIÓN DE TEST----------");
	}
}
