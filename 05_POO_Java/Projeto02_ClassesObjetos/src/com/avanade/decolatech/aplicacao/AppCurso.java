package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.codigo = 100;
		curso1.descricao = "Inteligência Artificial";
		curso1.ch = 120;
		curso1.preco = 4000;
		
		Curso curso2 = new Curso();
		curso1.codigo = 200;
		curso1.descricao = "Culinária Básica";
		curso1.ch = 8;
		curso1.preco = 0;
		
		Curso curso3 = curso1;
		curso2 = null;
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
	}
}
