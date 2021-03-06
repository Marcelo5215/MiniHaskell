package br.unb.poo.mh;

public class PrettyPrinter implements Visitor{

	@Override
	public void visitar(ValorInteiro exp) {
		System.out.print(exp.getValor());
	}

	@Override
	public void visitar(ValorBooleano exp) {
		System.out.print(exp.getValor());
	}
	
	@Override
	public void visitar(ExpressaoSoma exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("+");
		exp.expDireita.aceitar(this);
		System.out.print(")");
	}
	
	@Override
	public void visitar(ExpressaoSubtracao exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("-");
		exp.expDireita.aceitar(this);
		System.out.print(")");
	}

	@Override
	public void visitar(Multiplicacao exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("*");
		exp.expDireita.aceitar(this);
		System.out.print(")");
	}
	
	@Override
	public void visitar(ExpressaoDivisao exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("/");
		exp.expDireita.aceitar(this);
		System.out.print(")");
	}


	@Override
	public void visitar(IfThenElse exp) {
		System.out.print("if( ");
		exp.condicao.aceitar(this);
		System.out.println(")");
		
		System.out.print("then ");
		exp.clausulaThen.aceitar(this);
		
		System.out.println("else " );
		exp.clausulaElse.aceitar(this);
	}

	@Override
	public void visitar(AplicacaoFuncao exp) {
		System.out.print(exp.nome);
		System.out.print("(");
		int i = 0;
		while(i < exp.parametros.size() - 1) {
			exp.parametros.get(i++).aceitar(this);
			System.out.print(",");
		}
		if(i == exp.parametros.size() - 1) {
			exp.parametros.get(i++).aceitar(this);
		}
		System.out.println(")");
	}

	@Override
	public void visitar(Identificador exp) {
		System.out.println(exp.id);
	}

	@Override
	public void visitar(ExpressaoGT exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print(">");
		exp.expDireita.aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoGTE exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print(">=");
		exp.expDireita.aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoLT exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("<");
		exp.expDireita.aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoLTE exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("<=");
		exp.expDireita.aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoEqual exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("==");
		exp.expDireita.aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoAND exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("&&");
		exp.expDireita.aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoOR exp) {
		System.out.print("(");
		exp.expEsquerda.aceitar(this);
		System.out.print("||");
		exp.expDireita.aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoNOT exp) {
		System.out.print("not(");
		exp.expUnica.aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoLet exp) {
		System.out.print("let = ");
		exp.getDef().aceitar(this);
		System.out.print("in ");
		exp.getCorpo().aceitar(this);
	}
	
	@Override
	public void visitar(ExpressaoREF exp) {
		System.out.print(exp.getID());
		System.out.print(" = ");
		exp.avaliar().aceitar(this);
	}
	
	@Override
	public void visitar(ValorListaVazia exp) {
		System.out.print("[]");
	}

	@Override
	public void visitar(ValorListaNVazia exp) {
		System.out.print("[");
		System.out.print(exp.getValor());
		System.out.print("]");
	}
	
}
