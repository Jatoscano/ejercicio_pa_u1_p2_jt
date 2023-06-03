package com.example.demo.repository.uce.edu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.uce.edu.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{

	
	private static List<Propietario> baseDatos = new ArrayList<>();
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		
		baseDatos.add(propietario);
	}

	@Override
	public void elmimiar(String id) {
		Propietario propietario = this.seleccionarPropietarioa(id);
		baseDatos.remove(propietario);
	}

	@Override
	public Propietario seleccionarPropietarioa(String id) {
		// TODO Auto-generated method stub
		Propietario propietarioEcontrado = new Propietario();
		
		for (Propietario propietario: baseDatos) {
			if (id.equals(propietario.getIdentificacion())) {
				propietarioEcontrado = propietario;
				
			}
		}
		
		return propietarioEcontrado;
	}

	
}
