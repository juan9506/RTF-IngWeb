package co.udea.iw.dao;

import co.udea.iw.dto.Solicitud;
import java.util.List;

public interface SolicitudDAO {
	public List<Solicitud> getSolicitudes() throws Exception;
}
