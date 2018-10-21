package co.udea.iw.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.udea.iw.dao.ClienteDAO;
import co.udea.iw.dto.Cliente;
import co.udea.iw.dto.Personal;
import co.udea.iw.exception.Exception;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations="classpath:configuracion.xml")
class ClienteImplTest {

	@Autowired 
	ClienteDAO clienteDao;
	Personal responsable = new Personal(10397014, "Juan Esteban Andrade", "Gerente");
	Cliente cliente = new Cliente(1234567, "Luis Marin", "luis.marin@udea.edu.co");
	
	@Test
	void testGenerarSolicitud() {
		try {
			clienteDao.generarSolicitud(001, "Cambio de nevera", "Solicito cambio por garantia de mi nevera", null, responsable, "Complejo", cliente);
			assertTrue(true);
		}catch(Exception e) {
			fail(e);
		}
	}

}
