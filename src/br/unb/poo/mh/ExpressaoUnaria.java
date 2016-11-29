package br.unb.poo.mh;

public abstract class ExpressaoUnaria implements Expressao{
	
	protected Expressao expUnica;
	
	public ExpressaoUnaria(Expressao exp) {
		this.expUnica = exp;
	}
	
}
