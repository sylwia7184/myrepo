package com.example.database.repository;

import com.example.database.entity.SecondTable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondTableRepository extends MongoRepository<SecondTable, String> {
}