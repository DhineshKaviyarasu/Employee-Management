package com.employee.data.service;

import java.util.List;

import com.employee.data.entity.Employee;

public interface Employee_service {

	public List<Employee> getallemployees();
	
	public void saveemployee(Employee employee);
	
	public Employee getbyId(int id);
	
	public void deletebyid(int id);
}
