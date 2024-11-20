package com.studentAcadamicsDetails.studentAcadamicDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studentAcadamicsDetails.studentAcadamicDetails.entity.TestTable;
import com.studentAcadamicsDetails.studentAcadamicDetails.repository.TestTableRepository;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TestTableController {

    @Autowired
    private TestTableRepository testTableRepository;

    @GetMapping
    public List<TestTable> getAllTasks() {
    	
        return testTableRepository.findAll();
    }
    
    @PostMapping
    public TestTable addTestTable (TestTable testTable) {
    	
    	testTable.setName("name1");
    	testTable.setAddress("address 1");
    	return testTableRepository.save(testTable);
    }
}

