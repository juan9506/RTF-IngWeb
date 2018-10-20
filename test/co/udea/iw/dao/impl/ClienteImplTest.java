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

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations="classpath:configuracion.xml")
class ClienteImplTest {

	@Autowired
	ClienteDAO clienteDao;
	
	@Test
	void testGenerarSolicitud() {
		List<Cliente> clientes = null;
		try {
			clientes = clienteDao.generarSolicitud("Juanes", "juanes", "juanes", "juanes", "juanes");
			for(Cliente cliente: clientes) {
				System.out.println(cliente.getNombres());
			}
			assertTrue(true);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}

}
