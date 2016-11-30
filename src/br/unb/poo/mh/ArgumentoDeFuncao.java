package br.unb.poo.mh;

public class ArgumentoDeFuncao {
	private String nome;
	private Tipo tipo;
	
	public ArgumentoDeFuncao(String nome, Tipo tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
}
