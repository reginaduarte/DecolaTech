package com.avanade.decolatech.rh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.services.CandidatoService;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
	
	@Autowired
	private CandidatoService candidatoService;
	
	@GetMapping("/lista")
	public List<Candidato> listar(){
		return candidatoService.listarCandidatos();
	}
	
}
