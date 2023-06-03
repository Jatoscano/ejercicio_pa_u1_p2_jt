package com.example.demo.repository.uce.edu;

import com.example.demo.repository.uce.edu.modelo.Vehiculo;

public interface VehiculoRepository {

	public void crear(Vehiculo vehiculo);
	public void eliminar (String placa);
	public Vehiculo seleccionarVehiculo(String placa);
	
}
