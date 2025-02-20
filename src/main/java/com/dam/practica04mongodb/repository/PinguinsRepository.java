package com.dam.practica04mongodb.repository;

import com.dam.practica04mongodb.model.Pinguins;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PinguinsRepository extends MongoRepository<Pinguins, String> {
}

