package com.avanade.decolatech.rh.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.dto.CandidatoInscricoesDTO;
import com.avanade.decolatech.rh.dto.InscricaoDTO;
import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.entities.Cargo;
import com.avanade.decolatech.rh.entities.Inscricao;
import com.avanade.decolatech.rh.repositories.InscricaoRepository;

@Service
public class InscricaoService {

	@Autowired
	private InscricaoRepository inscricaoRepository;
	
	@Autowired
	private CargoService cargoService;
	
	@Autowired
	private CandidatoService candidatoService;
	
	public List<InscricaoDTO> listarInscricoesDTO() {
		return inscricaoRepository.listarInscricoesDTO();
	}
	
	public List<CandidatoInscricoesDTO> listarInscricoesPorCandidatoDTO() {
		return inscricaoRepository.listarInscricoesPorCandidatoDTO();
	}
	
	public List<CandidatoInscricoesDTO> listarInscricoesPorCandidatoDTOByCPF(String cpf) {
		return inscricaoRepository.listarInscricoesPorCandidatoDTOByCPF(cpf);
	}
	
	public String efetuarInscricao(Map<String, String> dados) throws ParseException {
		
		String cpf = dados.get("cpf");
		int id_cargo = Integer.parseInt(dados.get("idCargo"));
		int situacao = Integer.parseInt(dados.get("situacao"));
		String data = dados.get("dataInscricao");
		
		Cargo cargo = cargoService.buscarCargo(id_cargo);
		Candidato candidato = candidatoService.buscarCandidato(cpf);
		
		Date dataInscricao = new SimpleDateFormat("yyyy-MM-dd").parse(data);
		
		// Criando uma instância da classe inscrição
		Inscricao inscricao = new Inscricao();
		inscricao.setCandidato(candidato);
		inscricao.setCargo(cargo);
		inscricao.setDatainscricao(dataInscricao);
		inscricao.setSituacao(situacao);
		
		// Persistindo a inscrição com o JPA
		inscricaoRepository.save(inscricao);
		return "Inscrição efetuada com sucesso!";
	}
}


