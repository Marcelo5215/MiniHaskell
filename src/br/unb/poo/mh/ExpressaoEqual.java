package br.unb.poo.mh;

public class ExpressaoEqual extends ExpressaoBinaria{


	public ExpressaoEqual(Expressao expDireita, Expressao expEsquerda) {
		super(expEsquerda, expDireita);

	}

	@Override
	public Valor avaliar() {
		if(expEsquerda.tipo() == Tipo.Booleano && expDireita.tipo() == Tipo.Booleano){
			ValorBooleano ve = (ValorBooleano)expEsquerda.avaliar();
			ValorBooleano vd = (ValorBooleano)expDireita.avaliar();
			
			return new ValorBooleano(ve.getValor() == vd.getValor());
		}
		else if(expEsquerda.tipo() == Tipo.Inteiro && expDireita.tipo() == Tipo.Inteiro){
			ValorInteiro ve = (ValorInteiro)expEsquerda.avaliar();
			ValorInteiro vd = (ValorInteiro)expDireita.avaliar();
			
			return new ValorBooleano(ve.getValor() == vd.getValor());
		}
		
		return new ValorBooleano(false);
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
