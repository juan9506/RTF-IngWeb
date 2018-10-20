package co.udea.iw.dao.impl;

import co.udea.iw.dto.Cliente;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import co.udea.iw.dao.ClienteDAO;
import co.udea.iw.exception.Exception;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ClienteImpl extends HibernateDaoSupport implements ClienteDAO {


	@Override
	public List<Cliente> generarSolicitud(String titulo, String descripcion, String responsable, String complejidad, String cliente) throws Exception {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			Session session = getSession();
			Criteria criteria = session.createCriteria(Cliente.class);
			clientes = criteria.list();
			return clientes;
		}catch(HibernateException e) {
			throw new Exception(e);
		}
	}

}
