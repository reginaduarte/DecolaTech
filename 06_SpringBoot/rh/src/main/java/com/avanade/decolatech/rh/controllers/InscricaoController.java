package com.avanade.decolatech.rh.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.avanade.decolatech.rh.common.Resposta;
import com.avanade.decolatech.rh.dto.CandidatoInscricoesDTO;
import com.avanade.decolatech.rh.dto.InscricaoDTO;
import com.avanade.decolatech.rh.services.InscricaoService;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

	@Autowired
	private InscricaoService inscricaoService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<InscricaoDTO>> listar() {
		return new ResponseEntity<List<InscricaoDTO>> (
				inscricaoService.listarInscricoesDTO(), HttpStatus.OK);
	}
	
	@GetMapping({"/candidatos", "/candidatos/{cpf}"})
	public ResponseEntity<List<CandidatoInscricoesDTO>> 
	    listarInscricoesPorCandidato(@PathVariable(name = "cpf", required = false) String cpf) {
	    if (cpf == null) {
	        return new ResponseEntity<List<CandidatoInscricoesDTO>>(
	            inscricaoService.listarInscricoesPorCandidatoDTO(), HttpStatus.OK);
	    } else {
	        return new ResponseEntity<List<CandidatoInscricoesDTO>>(
	            inscricaoService.listarInscricoesPorCandidatoDTOByCPF(cpf), HttpStatus.OK);
	    }
	}
	
	@PostMapping("/novo")
	public ResponseEntity<Resposta> incluir(@RequestBody Map<String, String> dados) {
		try {
			String inscricao = inscricaoService.efetuarInscricao(dados);
			return new ResponseEntity<Resposta>(
					new Resposta(201, new Date(), inscricao), HttpStatus.CREATED);
		
		} catch (Exception e) {
			return new ResponseEntity<Resposta>(
					new Resposta(400, new Date(), e.getMessage()), HttpStatus.BAD_REQUEST);
			
		}
	}
	
}	
	
	
//	@GetMapping("/candidatos")
//	public ResponseEntity<List<CandidatoInscricoesDTO>> listarInscricoesPorCandidatoDTO() {
//		return new ResponseEntity<List<CandidatoInscricoesDTO>> (
//				inscricaoService.listarInscricoesPorCandidatoDTO(), HttpStatus.OK);
//	}
//	
//	@GetMapping("/candidatos/{cpf}")
//	public ResponseEntity<List<CandidatoInscricoesDTO>> 
//		listarInscricoesPorCandidatoDTOByCPF(@PathVariable("cpf") String cpf) {
//		return new ResponseEntity<List<CandidatoInscricoesDTO>> (
//				inscricaoService.listarInscricoesPorCandidatoDTOByCPF(cpf), HttpStatus.OK);
//	}