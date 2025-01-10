package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setCodigo(100);
		curso1.setDescricao("Inteligência Artificial");
		curso1.setCh(100);
		curso1.setPreco(4000);
		
		Curso curso2 = new Curso();
		curso1.setCodigo(200);
		curso1.setDescricao("Culinária Básica");
		curso1.setCh(8);
		curso1.setPreco(-10);
		
		Curso curso3 = curso1;
		curso2 = null;
		
		System.gc();
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
	}
}
