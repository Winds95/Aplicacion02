package com.distribuida.servicios;

import java.util.List;

import com.distribuida.dto.Geo;

public interface ServicioGeo {
	
	List<Geo> listar();

	Geo buscarPorId(Integer id);

}
