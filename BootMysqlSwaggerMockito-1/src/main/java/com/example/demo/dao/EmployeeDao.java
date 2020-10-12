package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeDao {

	public Integer saveData(Employee employee);

	public List<Employee> getAll();

	public Optional<Employee> fetchById(Integer id);
}
