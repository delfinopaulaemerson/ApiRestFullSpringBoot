package com.emersondelfino.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersondelfino.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;

}
