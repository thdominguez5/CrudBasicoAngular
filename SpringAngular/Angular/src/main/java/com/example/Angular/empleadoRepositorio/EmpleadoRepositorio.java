package com.example.Angular.empleadoRepositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.Angular.model.Empleado;

public interface EmpleadoRepositorio extends Repository<Empleado, Integer>{
	List<Empleado>findAll();
	Empleado findOne(int id);
	Empleado save(Empleado e);
	void delete(Empleado e);
}
