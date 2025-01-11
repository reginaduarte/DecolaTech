package com.avanade.decolatech.aplicacao;

import java.util.ArrayList;
import java.util.List;

import com.avanade.decolatech.classes.Aluno;
import com.avanade.decolatech.classes.Curso;
import com.avanade.decolatech.enumeracao.Generos;

public class AppAluno {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		Curso c1 = new Curso();
		c1.setCodigo(100);
		c1.setDescricao("Oracle Básico");
		c1.setCh(40);
		c1.setPreco(0);
		
		Curso c2 = new Curso();
		c2.setCodigo(200);
		c2.setDescricao("Análise de Dados");
		c2.setCh(32);
		c2.setPreco(1000);
		
		// Adicionando os cursos na lista
		cursos.add(c1);
		cursos.add(c2);
		
		// Criando uma instância na classe aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Álvaro Silva");
		aluno.setIdade(42);
		aluno.setGenero(Generos.Masculino);
		aluno.setMatricula(1234);
		
		Curso c3 = new Curso();
		c3.setCodigo(30);
		c3.setDescricao("Inteligência Emocial");
		c3.setCh(40);
		c3.setPreco(0);
		
		aluno.adicionarCurso(c3);
		
		System.out.println(aluno.getDados());
	}
}
