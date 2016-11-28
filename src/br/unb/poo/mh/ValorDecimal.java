package br.unb.poo.mh;

public class ValorDecimal extends ValorParametrizado<Double>{

	public ValorDecimal(Double valor) {
		super(valor);
	}

	@Override
	public Tipo tipo() {
		return Tipo.Decimal;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}
