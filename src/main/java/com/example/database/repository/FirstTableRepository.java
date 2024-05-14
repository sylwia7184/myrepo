package com.example.database.repository;

import com.example.database.entity.FirstTable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstTableRepository extends MongoRepository<FirstTable, String> {
}