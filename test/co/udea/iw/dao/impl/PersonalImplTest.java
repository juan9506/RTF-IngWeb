package co.udea.iw.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.udea.iw.dao.PersonalDAO;
import co.udea.iw.dao.SolicitudDAO;
import co.udea.iw.dto.Solicitud;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations="classpath:configuracion.xml")
class PersonalImplTest {

	@Autowired
	SolicitudDAO solicitudDao;
	@Autowired
	PersonalDAO personalDao;
	
	@Test
	void testListarSolicitudes(){
		List<Solicitud> solicitudes = null;
		try {
			solicitudes = solicitudDao.getSolicitudes();
			for(Solicitud solicitud: solicitudes) {
				System.out.println(solicitud.getTitulo());
			}
			assertTrue(true);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	void testResponderSolicitud() {
		try {
			personalDao.responderSolicitud(001, "Solicitud denegada");
			assertTrue(true);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}

}
