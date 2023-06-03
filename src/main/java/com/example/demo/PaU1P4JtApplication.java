package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.uce.edu.modelo.Vehiculo;
import com.example.demo.service.uce.edu.PropietarioService;
import com.example.demo.service.uce.edu.VehiculoService;

@SpringBootApplication
public class PaU1P4JtApplication implements CommandLineRunner{

	@Autowired
	public VehiculoService vehiculoService;
	
	@Autowired
	
	public PropietarioService propietarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(PaU1P4JtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo = new Vehiculo();
		
		vehiculo.setMarca("BMW");
		vehiculo.setPlaca("PAA1234");
		
		System.out.println(vehiculo.toString());
	}

	
}
