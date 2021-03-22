package com.example.Angular.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Angular.empleadoRepositorio.EmpleadoRepositorio;
import com.example.Angular.model.Empleado;


@Service
public class EmpleadoServiceImp implements EmpleadoService{

	@Autowired
	private EmpleadoRepositorio repositorio;
	
	@Override
	public List<Empleado> listar() {
		return repositorio.findAll();
	}

	@Override
	public Empleado listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado add(Empleado e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado edit(Empleado e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
