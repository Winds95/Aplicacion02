package com.distribuida.servicios;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Geo;

@ApplicationScoped
@Transactional
public class ServicioGeoImp implements ServicioGeo {
	
	@PersistenceContext(unitName = "todosPU")
	private EntityManager entityManager;
	
	@Override
	public List<Geo> listar() {
		List<Geo> lista = null;
		lista = entityManager.createNamedQuery("Geo.findAll", Geo.class).getResultList();
		return lista;
	}

	@Override
	public Geo buscarPorId(Integer id) {
		Geo geo = null;
		geo = entityManager.find(Geo.class, id);
		return geo;
	}	
}
