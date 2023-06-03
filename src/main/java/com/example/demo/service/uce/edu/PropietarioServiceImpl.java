package com.example.demo.service.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.uce.edu.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService{

	@Autowired
	private PropietarioService propietarioService;
	@Override
	public void aniadir(Propietario propietario) {
	
		propietarioService.aniadir(propietario);
	}

	@Override
	public void borrar(String id) {

		propietarioService.borrar(id);
	}

	@Override
	public Propietario seleccionarPropietarioa(String id) {
		
		return propietarioService.seleccionarPropietarioa(id);
	}
	
	

}
