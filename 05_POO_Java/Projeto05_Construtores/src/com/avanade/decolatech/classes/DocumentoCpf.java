package com.avanade.decolatech.classes;

import com.avanade.decolatech.interfaces.Documento;

public class DocumentoCpf implements Documento{
	private String numero;
	@Override
	public void setNumero(String numero) {
		if(!numero.matches("[0-9]{11}")) {
			throw new IllegalArgumentException("O CPF dete ter 11 dígitos.");
		}
		this.numero = numero;
	}
	@Override
	public String getNumero() {
		return "CPF: " + this.numero;
	}
}
