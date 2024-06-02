package com.example.database_display.repository;

import com.example.database_display.entity.FirstTable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstTableRepository extends MongoRepository<FirstTable, String> {
}