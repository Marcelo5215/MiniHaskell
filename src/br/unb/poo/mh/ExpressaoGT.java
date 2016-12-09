package br.unb.poo.mh;

public class ExpressaoGT extends ExpressaoBinaria {

	public ExpressaoGT(Expressao expEsquerda, Expressao expDireita) {
		super(expEsquerda, expDireita);
	}

	@Override
	public Valor avaliar() {
		ValorInteiro ve = (ValorInteiro)expEsquerda.avaliar();
		ValorInteiro vd = (ValorInteiro)expDireita.avaliar();
		Boolean temp = ve.getValor() > vd.getValor();
		return new ValorBooleano(temp);
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
