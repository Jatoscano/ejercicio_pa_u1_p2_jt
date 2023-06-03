package com.example.demo.service.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.uce.edu.MatriculaRepository;
import com.example.demo.repository.uce.edu.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Override
	public void aniadir(Matricula matricula) {
		
		matriculaRepository.crear(matricula);
	}

	
}
