package com.example.Angular.Service;

import java.util.List;

import com.example.Angular.model.Empleado;

public interface EmpleadoService {

	List<Empleado>listar();
	
	Empleado listarId(int id);
	
	Empleado add(Empleado e);

	Empleado edit(Empleado e);
	
	Empleado delete(int id);
}
