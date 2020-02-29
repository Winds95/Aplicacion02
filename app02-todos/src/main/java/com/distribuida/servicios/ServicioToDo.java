package com.distribuida.servicios;

import java.util.List;

import com.distribuida.dto.Todo;

public interface ServicioToDo {
	
	List<Todo> listar();

	Todo buscarPorId(Integer id);

}
