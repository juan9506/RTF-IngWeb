package co.udea.iw.dao;
import java.util.List;

import co.udea.iw.exception.Exception;
import co.udea.iw.dto.Cliente;

/**
 * 
 * @author Juan Esteban Andrade - Luis Marin
 * Dao para acceder a los datos de los clientes
 *
 */
public interface ClienteDAO {

	public List<Cliente> generarSolicitud(String titulo, String descripcion, String responsable, String complejidad, String cliente) throws Exception;
}
