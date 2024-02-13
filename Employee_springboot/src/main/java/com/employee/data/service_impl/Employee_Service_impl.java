package com.employee.data.service_impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.data.entity.Employee;
import com.employee.data.repo.Employee_repo;
import com.employee.data.service.Employee_service;

@Service
public class Employee_Service_impl implements Employee_service {

	@Autowired
	private Employee_repo empRepo;
	
	@Override
	public List<Employee> getallemployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public void saveemployee(Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);

	}

	@Override
	public Employee getbyId(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional=empRepo.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}
		else {
			throw new RuntimeException(
					"Employee not found in database id-"+id);
		}
		return employee;
	}

	@Override
	public void deletebyid(int id) {
		// TODO Auto-generated method stub

		empRepo.deleteById(id);
	}

}
