package com.avanade.decolatech.rh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.services.CandidatoService;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
	
	@Autowired
	private CandidatoService candidatoService;
	
	//@CrossOrigin
	@GetMapping("/lista")
	public ResponseEntity<List<Candidato>> listar(){
		return new ResponseEntity<List<Candidato>>(
				candidatoService.listarCandidatos(), HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{cpf}")
	public ResponseEntity<Candidato> buscar(@PathVariable String cpf) {
		return new ResponseEntity<Candidato>(candidatoService.buscarCandidato(cpf), HttpStatus.OK);
	}
	
	@PostMapping("/novo")
	public ResponseEntity<?> incluir(@RequestBody Candidato candidato) {
		try {
			return new ResponseEntity<Candidato>(
					candidatoService.incluirCandidato(candidato), HttpStatus.CREATED);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
	@PutMapping("/alterar/{cpf}")
	public ResponseEntity<Candidato> alterar(
			@RequestBody Candidato candidato, @PathVariable String cpf) {
		return new ResponseEntity<Candidato>(
				candidatoService.alterarCandidato(candidato, cpf), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/remover/{cpf}")
	public ResponseEntity<String> remover(@PathVariable String cpf) {
		return new ResponseEntity<String>(candidatoService.removerCandidato(cpf), HttpStatus.ACCEPTED);
	}
	
}
