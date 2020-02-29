package com.distribuida.servicios;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Company;

@ApplicationScoped
@Transactional
public class ServicioCompanyImp implements ServicioCompany {
	
	@PersistenceContext(unitName = "todosPU")
	private EntityManager entityManager;
	
	@Override
	public List<Company> listar() {
		List<Company> lista = null;
		lista = entityManager.createNamedQuery("Company.findAll", Company.class).getResultList();
		return lista;
	}

	@Override
	public Company buscarPorId(Integer id) {
		Company company = null;
		company = entityManager.find(Company.class, id);
		return company;
	}

}
