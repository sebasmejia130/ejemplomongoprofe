package com.ciudades.ciudades.service;

import java.util.List;
import java.util.Optional;

import com.ciudades.ciudades.model.Departamento;

public interface DepartamentoService {
	
	public Departamento actualizarDepartamento(Departamento departamento);
	public Departamento crearDepartamento(Departamento departamento);
	public void eliminarDepartamento();
	public Optional<Departamento> consultarDepartamentoPorId(Long id);
	public List<Departamento> consultarLista();

}
