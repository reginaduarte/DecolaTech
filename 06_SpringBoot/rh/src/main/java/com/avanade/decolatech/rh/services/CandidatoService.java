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
	
	public Candidato incluirCandidato(Candidato candidato) {
		return candidatoRepository.save(candidato);
	}
	
	// Método para buscar um candidato pelo CPF
	public Candidato buscarCandidato(String cpf) {
		Candidato candidato = candidatoRepository.getReferenceById(cpf);
		return new Candidato(
				candidato.getCpf(),
				candidato.getNome(),
				candidato.getTelefone(),
				candidato.getEmail());
	}
	
	// Método para alterar um candidato
	public Candidato alterarCandidato(Candidato candidato, String cpf) {
		candidato.setCpf(cpf);
		return candidatoRepository.save(candidato);
		}
	
	public String removerCandidato(String cpf) {
		try {
			candidatoRepository.deleteById(cpf);
			return "Candidato removido";
		} catch (Exception e) {
			return e.toString();
		}
	}
}