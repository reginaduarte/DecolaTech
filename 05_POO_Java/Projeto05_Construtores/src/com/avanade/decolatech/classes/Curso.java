package com.avanade.decolatech.classes;

// Model or entity
public class Curso {
	
	// Attributes or variables
	private final int codigo;
	private String descricao;
	private int ch;
	private double preco;
	
	private static int CONTADOR;
	
	// Atributos ou variáveis da instância
	public Curso(String descricao, int ch) {
		this.codigo = CONTADOR++;
		this.setDescricao(descricao);
		this.setCh(ch);
	}
	// Dois construtores sobrecarregados
	public Curso(String descricao, int ch, double preco) {
		this(descricao, ch);
		this.setPreco(preco);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
//	public void setCodigo(int codigo) {
//		this.codigo = codigo;
//	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		// Workload must be greater than zero
		if( ch <= 0) {
			throw new NumberFormatException("A carga horária deve ser positiva.");
		}
		this.ch = ch;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if( preco < 0) {
			throw new NumberFormatException("O preço não pode ser negativo.");
		}
		this.preco = preco;
	}
	
	// métodos complementares
	// 1. Método para receber os valores de todos os atributos
	public void setDados(String descricao, int ch, double preco) {
		this.setDescricao(descricao);
		this.setCh(ch);
		this.setPreco(preco);
	}
	
	// 2. Método para retornar as informações do curso
	public String getDados() {
		String resposta = "Código: " + this.getCodigo() +
				"\nDescrição: " + this.getDescricao() +
				"\nCarga horária: " + this.getCh() +
				"\nPreço: " + this.getPreco();
		return resposta;
	}
}
