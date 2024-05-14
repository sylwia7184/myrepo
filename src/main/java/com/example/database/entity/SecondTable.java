package com.example.database.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "secondTable")
public class SecondTable {
    @Id
    private String id;
    private String description;

    // Getters and setters
}
