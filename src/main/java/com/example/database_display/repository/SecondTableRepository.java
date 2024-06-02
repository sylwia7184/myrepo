package com.example.database_display.repository;

import com.example.database_display.entity.SecondTable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondTableRepository extends MongoRepository<SecondTable, String> {
}