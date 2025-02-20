package com.dam.practica04mongodb.repository;

import com.dam.practica04mongodb.model.Pinguin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PinguinRepository extends MongoRepository<Pinguin, String> {
}
