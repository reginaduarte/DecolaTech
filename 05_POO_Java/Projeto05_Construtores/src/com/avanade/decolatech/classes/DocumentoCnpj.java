package com.avanade.decolatech.classes;

import com.avanade.decolatech.interfaces.Documento;

public class DocumentoCnpj implements Documento{
	private String numero;
	@Override
	public void setNumero(String numero) {
		if(numero.matches("[0-9]{14}")) {
			throw new IllegalArgumentException("O CNPJ dete ter 14 dígitos.");
		}
		this.numero = numero;
	}
	@Override
	public String getNumero() {
		return "CNPJ: " + this.numero;
	}
}
