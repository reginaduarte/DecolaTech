package com.avanade.decolatech.rh.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String inicio() {
		return "Sistema de Gestão de RH.";
	}
	@GetMapping("/nomes")
	public List<String> mostrarNomes(){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Emilio");
		nomes.add("Adriana");
		nomes.add("Danielle");
		return nomes;
	}
}