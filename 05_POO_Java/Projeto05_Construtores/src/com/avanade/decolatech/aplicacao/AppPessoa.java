package com.avanade.decolatech.aplicacao;

import javax.swing.JOptionPane;

import com.avanade.decolatech.classes.Endereco;
import com.avanade.decolatech.classes.Pessoa;
import com.avanade.decolatech.enumeracao.Generos;

public class AppPessoa {
	public static void main(String[] args) {
		Endereco end = new Endereco("Rua da Paz", 10, "Recife", "55400100");
		
		Pessoa p = new Pessoa();
		p.setNome("Jose Manoel");
		p.setIdade(55);
		p.setGenero(Generos.Masculino);
		p.setEndereco(end);	
		
		JOptionPane.showMessageDialog(null, p.getDados());
	}
}
