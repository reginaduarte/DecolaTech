package com.avanade.decolatech.rh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository candidatoRepository;
	public List<Candidato> listarCandidatos() {
		return candidatoRepository.findAll();
	}
}