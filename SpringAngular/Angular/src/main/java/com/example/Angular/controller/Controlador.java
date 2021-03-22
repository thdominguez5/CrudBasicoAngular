package com.example.Angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Angular.Service.EmpleadoService;
import com.example.Angular.model.Empleado;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/personas" })
public class Controlador {

	@Autowired
	EmpleadoService service;

	@GetMapping
	public List<Empleado>listar(){
		return service.listar();
	}
	
	

}
