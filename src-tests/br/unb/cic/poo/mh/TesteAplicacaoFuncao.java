package br.unb.cic.poo.mh;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.unb.poo.mh.Ambiente;
import br.unb.poo.mh.AplicacaoFuncao;
import br.unb.poo.mh.ArgumentoDeFuncao;
import br.unb.poo.mh.DeclaracaoFuncao;
import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoSoma;
import br.unb.poo.mh.Identificador;
import br.unb.poo.mh.PrettyPrinter;
import br.unb.poo.mh.TamanhoDasExpressoes;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorInteiro;

public class TesteAplicacaoFuncao {

	private DeclaracaoFuncao soma;
	
	@Before
	public void setUp() {
		List<ArgumentoDeFuncao> args = new ArrayList<>();
		ArgumentoDeFuncao x = new ArgumentoDeFuncao("x", Tipo.Inteiro);
		ArgumentoDeFuncao y = new ArgumentoDeFuncao("y", Tipo.Inteiro);

		args.add(x);
		args.add(y);
		Expressao corpo = new ExpressaoSoma(new Identificador("x"), 
				new Identificador("y"));
		
		soma = new DeclaracaoFuncao("soma", args, corpo);
		Ambiente.instance().declaraFuncao(soma);
	
	}
	
	@Test
	public void testeAplicacaoFuncao() {
		List<Expressao> parametros = new ArrayList<>();
		parametros.add(new ValorInteiro(3));
		parametros.add(new ExpressaoSoma(new ValorInteiro(4), new ValorInteiro(5)));
		
		Expressao aplicaSoma = new AplicacaoFuncao("soma", parametros);
		
		Assert.assertEquals(new ValorInteiro(12), aplicaSoma.avaliar());
		
		PrettyPrinter pp = new PrettyPrinter();
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();
		
		aplicaSoma.aceitar(pp);
		aplicaSoma.aceitar(t);
		System.out.println(t.getTamanho());
		
	}
	
	@Test
	public void checagemDeTipo() {
		List<Expressao> parametros = new ArrayList<>();
		parametros.add(new ValorInteiro(3));
		parametros.add(new ExpressaoSoma(new ValorInteiro(4), new ValorInteiro(5)));
		
		AplicacaoFuncao aplicaSoma = new AplicacaoFuncao("soma", parametros);
		Assert.assertEquals(true, aplicaSoma.checaArgumentos());
		
	}
}
