package com.avanade.decolatech.aplicacao;

import javax.swing.JOptionPane;

import com.avanade.decolatech.classes.Funcionario;
import com.avanade.decolatech.classes.Pessoa;
import com.avanade.decolatech.enumeracao.Generos;

public class AppPolimofismo2 {
	public static void main(String[] args) {
		Pessoa pessoa = new Funcionario();
		pessoa.setNome("Anderson Costa");
		pessoa.setIdade(32);
		pessoa.setGenero(Generos.Masculino);
		
		Funcionario func = (Funcionario)pessoa;
		func.setCargo("Estagiário");
		func.setSalario(15000);
		
		JOptionPane.showMessageDialog(null, func.getDados());
	}
}
