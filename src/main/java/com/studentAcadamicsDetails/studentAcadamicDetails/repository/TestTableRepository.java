package com.studentAcadamicsDetails.studentAcadamicDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentAcadamicsDetails.studentAcadamicDetails.entity.TestTable;

public interface TestTableRepository extends JpaRepository<TestTable, Long> {
    // Custom queries can be added here if needed
}

