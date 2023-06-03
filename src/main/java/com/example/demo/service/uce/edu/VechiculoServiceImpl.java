package com.example.demo.service.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.uce.edu.VehiculoRepository;
import com.example.demo.repository.uce.edu.modelo.Vehiculo;
@Service
public class VechiculoServiceImpl implements VehiculoService{

	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Override
	public void aniadir(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		vehiculoRepository.crear(vehiculo);
	}

	@Override
	public void borrar(String placa) {
		
		vehiculoRepository.eliminar(placa);
		
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		
		return vehiculoRepository.seleccionarVehiculo(placa);
	}

}
