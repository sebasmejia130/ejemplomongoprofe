package com.ciudades.ciudades.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


import com.ciudades.ciudades.model.Pais;

@Repository
public interface PaisRepository extends MongoRepository<Pais, Long>{
	
	@Query("{descripcion:'?0'}")
    List<Pais> findByDescripcion(String descripcion);
	
	

}
