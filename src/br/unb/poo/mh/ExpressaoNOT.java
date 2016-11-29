package br.unb.poo.mh;

public class ExpressaoNOT extends ExpressaoUnaria{

	public ExpressaoNOT(Expressao exp) {
		super(exp);
	}
	
	@Override
	public Valor avaliar() {
		ValorBooleano valor = (ValorBooleano)expUnica.avaliar();
		
		return new ValorBooleano(!valor.getValor());
	}

	@Override
	public Tipo tipo() {
		return (expUnica.tipo() == Tipo.Booleano) ? Tipo.Booleano : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
