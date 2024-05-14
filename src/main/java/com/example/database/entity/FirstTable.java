package com.example.database.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "firstTable")
public class FirstTable {
    @Id
    private String id;
    private String name;

    // Getters and setters
}
