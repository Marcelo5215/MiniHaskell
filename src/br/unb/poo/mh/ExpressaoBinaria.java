package br.unb.poo.mh;

public abstract class ExpressaoBinaria implements Expressao {
	protected Expressao expDireita;
	protected Expressao expEsquerda; 
	
	//Invertido a ordem dos argumentos
	public ExpressaoBinaria(Expressao expEsquerda, Expressao expDireita) {
		this.expDireita = expDireita;
		this.expEsquerda = expEsquerda;
	}
	
}
