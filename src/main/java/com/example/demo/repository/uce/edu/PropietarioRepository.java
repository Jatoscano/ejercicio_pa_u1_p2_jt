package com.example.demo.repository.uce.edu;

import com.example.demo.repository.uce.edu.modelo.Propietario;

public interface PropietarioRepository {

	public void crear(Propietario propietario);
	public void elmimiar(String id);
	
	public Propietario seleccionarPropietarioa(String id);
}
