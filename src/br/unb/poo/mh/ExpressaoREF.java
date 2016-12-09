package br.unb.poo.mh;

public class ExpressaoREF implements Expressao {

	private String id;

	public ExpressaoREF(String id) {
		this.id = id;
	}

	@Override
	public Tipo tipo(){
		Expressao exp = Ambiente.instance().getExpressao(id);
		if(exp != null) {
			return exp.tipo();
		}
		return Tipo.Error;
	}

	@Override
	public Valor avaliar() {
		Expressao exp = Ambiente.instance().getExpressao(id);
		if(exp != null) {
			return exp.avaliar();
		}
		throw new RuntimeException("Variaval: " + id + " nao declarada");
	}
	
	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
	
	public String getID(){
		return id;
	}

}
