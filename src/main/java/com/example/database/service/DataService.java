package com.example.database.service;

import com.example.database.entity.FirstTable;
import com.example.database.entity.SecondTable;
import com.example.database.repository.FirstTableRepository;
import com.example.database.repository.SecondTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private FirstTableRepository firstTableRepository;

    @Autowired
    private SecondTableRepository secondTableRepository;

    public List<FirstTable> getFirstTableData() {
        return firstTableRepository.findAll();
    }

    public List<SecondTable> getSecondTableData() {
        return secondTableRepository.findAll();
    }
}