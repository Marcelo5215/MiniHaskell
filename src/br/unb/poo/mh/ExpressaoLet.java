package br.unb.poo.mh;

import java.util.ArrayList;
import java.util.List;

public class ExpressaoLet implements Expressao {

	private String id;
	private Expressao exp;
	private Expressao corpo;
	
	public ExpressaoLet(String id, Expressao exp, Expressao corpo) {
		this.id = id;
		this.exp = exp;
		this.corpo = corpo;
//		List<ArgumentoDeFuncao> args = new ArrayList<>();
//		ArgumentoDeFuncao a = new ArgumentoDeFuncao("a", exp.tipo());
//		args.add(a);
//		Ambiente.instance().declaraFuncao(new DeclaracaoFuncao(id, args, exp));
		
	}
	
	@Override
	public Valor avaliar() {
		Ambiente.instance().associaExpressao(id, exp);
		return corpo.avaliar();
	}

	@Override
	public Tipo tipo() {
		Ambiente.instance().associaExpressao(id, exp);
		return corpo.tipo();
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
	
	public Expressao getCorpo(){
		return corpo;
	}
	
	public Expressao getDef(){
		return exp;
	}

}
