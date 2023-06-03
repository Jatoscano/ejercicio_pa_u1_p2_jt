package com.example.demo.repository.uce.edu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.uce.edu.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{

   
	private static List<Vehiculo> basDatos = new ArrayList<>();

	@Override
	public void crear(Vehiculo vehiculo) {
		
		basDatos.add(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		Vehiculo vehiculo = this.seleccionarVehiculo(placa);
	}

	@Override
	public Vehiculo seleccionarVehiculo(String placa) {
		
		Vehiculo vehiculoEcontrado = new Vehiculo();
		
		for(Vehiculo vehiculo: basDatos) {
			if(placa.equals(vehiculo.getPlaca())) {
				vehiculoEcontrado = vehiculo;
			}
		}
		return vehiculoEcontrado;
	}

	

	
}
