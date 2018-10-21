package co.udea.iw.dao;
import java.util.Date;
import java.util.List;

import co.udea.iw.exception.Exception;
import co.udea.iw.dto.Cliente;
import co.udea.iw.dto.Personal;

/**
 * 
 * @author Juan Esteban Andrade - Luis Marin
 * Dao para acceder a los datos de los clientes
 *
 */
public interface ClienteDAO {

	public void generarSolicitud(int id, String titulo, String descripcion, Date fecha_solucion,  Personal responsable, String complejidad, Cliente cliente) throws Exception;
}
