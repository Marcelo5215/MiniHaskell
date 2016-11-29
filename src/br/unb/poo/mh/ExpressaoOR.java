package br.unb.poo.mh;

public class ExpressaoOR extends ExpressaoBinaria{

	public ExpressaoOR(Expressao expDireita, Expressao expEsquerda) {
		super(expDireita, expEsquerda);
	}
	
	@Override
	public Valor avaliar() {
		ValorBooleano ve = (ValorBooleano)expEsquerda.avaliar();
		ValorBooleano vd = (ValorBooleano)expDireita.avaliar();
		
		return new ValorBooleano(ve.getValor() || vd.getValor());
	}

	@Override
	public Tipo tipo() {
		return (expDireita.tipo() == Tipo.Booleano && expDireita.tipo() == Tipo.Booleano) ? Tipo.Booleano : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
