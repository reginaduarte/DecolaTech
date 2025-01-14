package com.avanade.decolatech.aplicacao;

import java.util.ArrayList;
import java.util.List;

import com.avanade.decolatech.classes.Aluno;
import com.avanade.decolatech.classes.Curso;
import com.avanade.decolatech.enumeracao.Generos;

public class AppAluno {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
	
		// Adicionando os cursos na lista
		cursos.add(new Curso("Oracle Básico", 40, 0));
		cursos.add(new Curso("Análise de Dados", 32, 1000));
		
		// Criando uma instância na classe aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Álvaro Silva");
		aluno.setIdade(42);
		aluno.setGenero(Generos.Masculino);
		aluno.setMatricula(1234);
		aluno.adicionarCurso(new Curso("Análise de Dados", 32, 1000));
		aluno.adicionarCurso(new Curso("Inteligência Emocial", 40));
		
		System.out.println(aluno.getDados());
	}
}
