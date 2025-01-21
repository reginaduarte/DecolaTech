package com.avanade.decolatech.rh.common;

import java.util.Date;

public class Resposta {
	private int codigo;
	private Date date;
	private String mensagem;
	
	public Resposta(int codigo, Date data, String mensagem) {
		this.setCodigo(codigo);
		this.setDate(data);
		this.setMensagem(mensagem);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
