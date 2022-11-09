package com.ciudades.ciudades.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ciudades.ciudades.model.Departamento;

@Repository
public interface DepartamentoRepository extends MongoRepository<Departamento, Long> {

}
