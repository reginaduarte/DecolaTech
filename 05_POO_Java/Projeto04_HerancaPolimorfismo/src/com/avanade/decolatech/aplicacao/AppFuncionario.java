package com.avanade.decolatech.aplicacao;

import javax.swing.JOptionPane;

import com.avanade.decolatech.classes.DocumentoCpf;
import com.avanade.decolatech.classes.Funcionario;
import com.avanade.decolatech.enumeracao.Generos;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Mauricio de Souza");
		funcionario.setIdade(30);
		funcionario.setGenero(Generos.Masculino);
		funcionario.setCargo("Professor");
		funcionario.setSalario(2000);
		
		DocumentoCpf cpf = new DocumentoCpf();
		cpf.setNumero("137980630522");
		
		funcionario.setDocumento(cpf);
		
		JOptionPane.showMessageDialog(null, funcionario.getDados());
	}
}
