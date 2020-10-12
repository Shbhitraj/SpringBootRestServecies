package com.example.demo.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public Integer saveData(Employee employee) {

		return repo.save(employee).getId();
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> list = repo.findAll();
		System.out.println("getting mock data " + list);
		return list;
	}

	@Override
	public Optional<Employee> fetchById(Integer id) {
		return repo.findById(id);
	}

}
