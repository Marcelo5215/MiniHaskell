package br.unb.poo.mh;

public class ExpressaoDivisao extends ExpressaoBinaria{

	public ExpressaoDivisao(Expressao expDireita, Expressao expEsquerda) {
		super(expEsquerda, expDireita);
	}

	@Override
	public Valor avaliar() {
		ValorInteiro ve = (ValorInteiro)expEsquerda.avaliar();
		ValorInteiro vd = (ValorInteiro)expDireita.avaliar();
		
		return new ValorInteiro(ve.getValor() / vd.getValor());
	}
	
	@Override
	public Tipo tipo() {
		return (expEsquerda.tipo() == Tipo.Inteiro && expDireita.tipo() == Tipo.Inteiro) ? Tipo.Inteiro : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

	
}
