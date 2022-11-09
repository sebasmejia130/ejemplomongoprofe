package com.ciudades.ciudades.service;

import java.util.List;
import java.util.Optional;

import com.ciudades.ciudades.model.Ciudad;


public interface CiudadService {
	
	public Ciudad actualizarCiudad(Ciudad ciudad);
	public Ciudad crearCiudad(Ciudad ciudad);
	public void eliminarCiudad();
	public Optional<Ciudad> consultarCiudad(Long id, String descripcion);
	public List<Ciudad> consultarCiudadPorDepartamento(Long departamentoId); 
	public List<Ciudad> consultarLista();

}
