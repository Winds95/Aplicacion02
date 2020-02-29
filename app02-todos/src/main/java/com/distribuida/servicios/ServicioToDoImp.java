package com.distribuida.servicios;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Todo;

@ApplicationScoped
@Transactional
public class ServicioToDoImp implements ServicioToDo {
	
	@PersistenceContext(unitName = "todosPU")
	private EntityManager entityManager;
	
	@Override
	public List<Todo> listar() {
		List<Todo> lista = null;
		lista = entityManager.createNamedQuery("Todo.findAll", Todo.class).getResultList();
		return lista;
	}

	@Override
	public Todo buscarPorId(Integer id) {
		Todo todo = null;
		todo = entityManager.find(Todo.class, id);
		return todo;
	}	


}
