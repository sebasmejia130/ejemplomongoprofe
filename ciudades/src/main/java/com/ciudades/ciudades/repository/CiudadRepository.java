package com.ciudades.ciudades.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ciudades.ciudades.model.Ciudad;

@Repository
public interface CiudadRepository extends MongoRepository<Ciudad, Long> {
	
	@Query("{descripcion:'?0'}")
    List<Ciudad> findByDescripcion(String descripcion);
	
	@Query("{departamentoId:'?0'}")//0 indica que es el primer parametro
    List<Ciudad> findByDepartamentoId(Long id);

}
