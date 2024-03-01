package com.group5.backend.database.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
