package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDao {
	
	 List<Employee> findAll();
	 public Employee findById(int id);

public void save(Employee employee);
public void update(Employee employee,int eid);
public void delete(int eid);

}


