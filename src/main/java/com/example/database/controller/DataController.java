package com.example.database.controller;

import com.example.database.entity.FirstTable;
import com.example.database.entity.SecondTable;
import com.example.database.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/data")
    public String getData(Model model) {
        List<FirstTable> firstTableData = dataService.getFirstTableData();
        List<SecondTable> secondTableData = dataService.getSecondTableData();

        model.addAttribute("firstTableData", firstTableData);
        model.addAttribute("secondTableData", secondTableData);

        return "data";
    }
}
