package com.distribuida.servicios;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Direccion;

@ApplicationScoped
@Transactional
public class ServicioDireccionImp implements ServicioDireccion {
	
	@PersistenceContext(unitName = "todosPU")
	private EntityManager entityManager;
	
	@Override
	public List<Direccion> listar() {
		List<Direccion> lista = null;
		lista = entityManager.createNamedQuery("Direccion.findAll", Direccion.class).getResultList();
		return lista;
	}

	@Override
	public Direccion buscarPorId(Integer id) {
		Direccion direccion = null;
		direccion = entityManager.find(Direccion.class, id);
		return direccion;
	}

}
