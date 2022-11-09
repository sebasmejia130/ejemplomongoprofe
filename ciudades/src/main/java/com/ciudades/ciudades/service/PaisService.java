package com.ciudades.ciudades.service;

import java.util.List;
import java.util.Optional;

import com.ciudades.ciudades.model.Pais;



public interface PaisService {
	
	public Pais actualizarPais(Pais pais);
	public Pais crearPais(Pais pais);
	public String eliminarPais(Long id);
	public Optional<Pais> consultarPais(Long id, String descripcion);
	public List<Pais> consultarLista();
	

}
