package com.distribuida.servicios;

import java.util.List;

import com.distribuida.dto.Direccion;

public interface ServicioDireccion {
	
	List<Direccion> listar();

	Direccion buscarPorId(Integer id);

}
