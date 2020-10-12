package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.daoimpl.EmployeeDaoImpl;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@SpringBootTest
class BootCrudOperation1ApplicationTests {
	@Autowired
	private EmployeeDaoImpl impl;
	@MockBean
	private EmployeeRepo repo;

	@Test
	public void getEmployeeTest() {
		when(repo.findAll()).thenReturn(Stream.of(new Employee(102, "sam102", "developement", "30000"),
				new Employee(103, "jhon103", "tester", "28000")).collect(Collectors.toList()));
		assertEquals(2, impl.getAll().size());
	}

//	@Test
//	void contextLoads() {
//	}

}
