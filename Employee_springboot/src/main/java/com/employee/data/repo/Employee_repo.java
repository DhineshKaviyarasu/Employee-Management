package com.employee.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.data.entity.Employee;

@Repository
public interface Employee_repo extends JpaRepository<Employee, Integer> {

}
