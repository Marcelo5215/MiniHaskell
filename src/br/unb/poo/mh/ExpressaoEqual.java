package br.unb.poo.mh;

public class ExpressaoEqual extends ExpressaoBinaria{

	
	public ExpressaoEqual(Expressao expEsquerda, Expressao expDireita) {
		super(expEsquerda, expDireita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Valor avaliar() {
		ValorInteiro ve = (ValorInteiro)expEsquerda.avaliar();
		ValorInteiro vd = (ValorInteiro)expDireita.avaliar();
		
		return new ValorBooleano(ve.getValor() == vd.getValor());
	}

	@Override
	public Tipo tipo() {
		return (expDireita.tipo() == Tipo.Inteiro && expDireita.tipo() == Tipo.Inteiro) ? Tipo.Booleano : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
