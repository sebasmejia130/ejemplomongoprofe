package com.ciudades.ciudades.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciudades.ciudades.model.Pais;
import com.ciudades.ciudades.repository.PaisRepository;

public class PaisServiceImpl implements PaisService {

	@Autowired // crea la instancia
	private PaisRepository repositorio;

	@Override
	public Pais actualizarPais(Pais pais) {
		Optional<Pais> paisAActualizar = repositorio.findById(pais.getCodigo());
		if (paisAActualizar.isPresent()) {
			return repositorio.save(pais);
		}
		return null;
	}

	@Override
	public Pais crearPais(Pais pais) {
		Optional<Pais> paisAConsultar = repositorio.findById(pais.getCodigo());
		if (paisAConsultar.isPresent()) {
			return null;
		}
		List<Pais> paises = repositorio.findByDescripcion(pais.getDescripcion());
		if (paises.size() > 0) {
			return paises.get(0);
		}
		return repositorio.insert(pais);

	}

	@Override
	public String eliminarPais(Long id) {
		Optional<Pais> eliminado = repositorio.findById(id);
		if (eliminado.isPresent()) {
			repositorio.delete(eliminado.get());
			return "El registro fue eliminado con éxito!";
		} else {
			return "El registro no pudo ser eliminado porque no existe/ID no válido";
		}

	}

	@Override
	public Optional<Pais> consultarPais(Long id, String descripcion) {
		if (id == null && descripcion == null) {
			return Optional.empty();
		}

		if (id == null) {
			List<Pais> lista = repositorio.findByDescripcion(descripcion);
			return Optional.of(lista.get(0));
		}
		return repositorio.findById(id);

	}

	@Override
	public List<Pais> consultarLista() {
		return repositorio.findAll();
	}

}
