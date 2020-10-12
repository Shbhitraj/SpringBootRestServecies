package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daoimpl.EmployeeDaoImpl;
import com.example.demo.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeDaoImpl impl;

	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody Employee employee) {
		ResponseEntity<String> resp = null;
		try {
			Integer id = impl.saveData(employee);
			resp = new ResponseEntity<String>(id + "saved", HttpStatus.OK);

		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable To Save The Data", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}

		return resp;
	}

	@GetMapping("/all")
	public List<Employee> GetAll() {
		return impl.getAll();
	}

	@GetMapping("/get")
	public String getData() {
		return "registrtion";
	}

	@GetMapping("/jsp")
	public String getHomeJspPage() {
		return "<h1>home</h1>";
	}

	@GetMapping("/one/{id}")
	public Optional<Employee> ById(Integer id) {
		return impl.fetchById(id);

	}

//	public ResponseEntity<String> generateTokens() {
//
//		return ResponseEntity<String>.ok()
//	}

}
