package com.example.demo.service.uce.edu;

import com.example.demo.repository.uce.edu.modelo.Vehiculo;

public interface VehiculoService {

	public void aniadir(Vehiculo vehiculo);
	public void borrar (String placa);
	public Vehiculo buscarVehiculo(String placa);
}
