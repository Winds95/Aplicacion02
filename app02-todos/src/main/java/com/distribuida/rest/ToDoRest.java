package com.distribuida.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.dto.Direccion;
import com.distribuida.dto.Geo;
import com.distribuida.dto.Company;
import com.distribuida.dto.Todo;
import com.distribuida.servicios.ServicioDireccion;
import com.distribuida.servicios.ServicioGeo;
import com.distribuida.servicios.ServicioToDo;
import com.distribuida.servicios.ServicioCompany;


@Path("/todos")
@ApplicationScoped
public class ToDoRest {

	@Inject
	private ServicioToDo servicio;
	
	@Inject
	private ServicioDireccion servicioDir;
	
	@Inject
	private ServicioGeo servicioGeo;
	
	@Inject
	private ServicioCompany servicioCom;
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Todo listarId(@PathParam(value = "id") Integer id) {
		Todo todo = servicio.buscarPorId(id);
		return todo;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Todo> listar() {
		List<Todo> lista = servicio.listar();
		return lista;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Direccion listarIdDir(@PathParam(value = "id") Integer id) {
		Direccion dir = servicioDir.buscarPorId(id);
		return dir;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Direccion> listarDir() {
		List<Direccion> lista = servicioDir.listar();
		return lista;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Geo listarIdGeo(@PathParam(value = "id") Integer id) {
		Geo geo = servicioGeo.buscarPorId(id);
		return geo;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Geo> listarGeo() {
		List<Geo> lista = servicioGeo.listar();
		return lista;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Company listarIdCom(@PathParam(value = "id") Integer id) {
		Company com = servicioCom.buscarPorId(id);
		return com;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Company> listarCom() {
		List<Company> lista = servicioCom.listar();
		return lista;
	}

}
