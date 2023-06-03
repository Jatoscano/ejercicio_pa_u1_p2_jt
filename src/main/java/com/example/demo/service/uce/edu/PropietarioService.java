package com.example.demo.service.uce.edu;

import com.example.demo.repository.uce.edu.modelo.Propietario;

public interface PropietarioService {

	public void aniadir(Propietario propietario);
	public void borrar(String id);
	public Propietario seleccionarPropietarioa(String id);
}
