package com.emersondelfino.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersondelfino.repository.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

}
