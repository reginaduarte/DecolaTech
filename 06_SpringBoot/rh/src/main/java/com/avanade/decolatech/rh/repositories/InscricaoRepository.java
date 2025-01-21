package com.avanade.decolatech.rh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.avanade.decolatech.rh.dto.CandidatoInscricoesDTO;
import com.avanade.decolatech.rh.dto.InscricaoDTO;
import com.avanade.decolatech.rh.entities.Inscricao;

public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {
	
	@Query(value = "SELECT\r\n"
			+ "	A.DESCRICAO AS AREA,\r\n"
			+ "	C.DESCRICAO AS CARGO,\r\n"
			+ "	I.DATA_INSCRICAO AS [DATA INSCRIÇÃO],\r\n"
			+ "	CD.NOME AS CANDIDATO,\r\n"
			+ "	CD.TELEFONE\r\n"
			+ "FROM\r\n"
			+ "	TB_AREAS A INNER JOIN TB_CARGOS C \r\n"
			+ "		ON A.ID = C.ID_AREA\r\n"
			+ "	INNER JOIN TB_INSCRICOES I \r\n"
			+ "		ON C.ID = I.ID_CARGO\r\n"
			+ "	INNER JOIN TB_CANDIDATOS CD \r\n"
			+ "		ON I.CPF = CD.CPF", nativeQuery = true)
	List<InscricaoDTO> listarInscricoesDTO();
	
	@Query("SELECT new com.avanade.decolatech.rh.dto.CandidatoInscricoesDTO(cd.cpf, cd.nome, ic.dataInscricao) "
			+ "FROM Candidato cd INNER JOIN cd.inscricoes ic ON cd.cpf = ic.candidato.cpf")
	List<CandidatoInscricoesDTO> listarInscricoesPorCandidatoDTO();
	
	@Query("SELECT new com.avanade.decolatech.rh.dto.CandidatoInscricoesDTO(cd.cpf, cd.nome, ic.dataInscricao) "
	        + "FROM Candidato cd INNER JOIN cd.inscricoes ic ON cd.cpf = ic.candidato.cpf WHERE cd.cpf = :valorcpf")
	List<CandidatoInscricoesDTO> listarInscricoesPorCandidatoDTOByCPF(@Param("valorcpf") String cpf);
}
