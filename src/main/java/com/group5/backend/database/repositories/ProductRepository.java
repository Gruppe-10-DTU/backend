package com.group5.backend.database.repositories;

import com.group5.backend.database.model.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ProductRepository extends Neo4jRepository<Product, Long> {

}
