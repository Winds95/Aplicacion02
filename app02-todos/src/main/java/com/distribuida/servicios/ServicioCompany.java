package com.distribuida.servicios;

import java.util.List;

import com.distribuida.dto.Company;

public interface ServicioCompany {
	
	List<Company> listar();

	Company buscarPorId(Integer id);

}
