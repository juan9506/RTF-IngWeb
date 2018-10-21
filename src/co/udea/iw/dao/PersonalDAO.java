package co.udea.iw.dao;

import java.util.List;

import co.udea.iw.dto.Personal;
import co.udea.iw.dto.Solicitud;
import co.udea.iw.exception.Exception;

public interface PersonalDAO {
	public List<Solicitud> listarSolicitudes() throws Exception;
	public String responderSolicitud(int idSolicitud, String respuesta) throws Exception;
}
