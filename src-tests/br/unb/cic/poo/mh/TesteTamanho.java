package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Test;

import br.unb.poo.mh.*;
import junit.framework.Assert;

public class TesteTamanho {

	@Test
	public void testSoma() {
		ValorInteiro v5 = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		Expressao soma = new ExpressaoSoma(v5, v10);
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		soma.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(3, t.getTamanho());
	}
	
	@Test 
	public void testSubtracao(){
		ValorInteiro v23 = new ValorInteiro(23);
		ValorInteiro v2 = new ValorInteiro(2);
		Expressao subtracao = new ExpressaoSubtracao(v23, v2);
		
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		subtracao.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(3, t.getTamanho());
			
	}
	
	@Test
	public void testDivisao(){
		ValorInteiro v24 = new ValorInteiro(24);
		ValorInteiro v2 = new ValorInteiro(2);
		Expressao div = new ExpressaoDivisao(v24, v2);
		 
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		div.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(3, t.getTamanho());
			
	}
	
	@Test 
	public void testMultiplicao(){
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v5 = new ValorInteiro(5);
		Expressao m = new Multiplicacao(v10, new ExpressaoSoma(v10, v5));
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		m.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(5, t.getTamanho());
		
	}
	
	@Test 
	public void testGT(){
		Expressao e = new ExpressaoGT(new ValorInteiro(15), new ValorInteiro(15));
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		e.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(3, t.getTamanho());
	}
	
	@Test 
	public void testGTE(){
		Expressao e = new ExpressaoGTE(new ValorInteiro(15), new ValorInteiro(5));
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		e.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(3, t.getTamanho());
	}
	
	@Test 
	public void testLT(){
		Expressao e = new ExpressaoGTE(new ValorInteiro(15), new ValorInteiro(5));
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		e.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(3, t.getTamanho());
	}
	
	@Test 
	public void testLTE(){
		Expressao e = new ExpressaoLTE(new ValorInteiro(15), new ValorInteiro(5));
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		e.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(3, t.getTamanho());
	}
	
	@Test 
	public void testAND(){
		Expressao e = new ExpressaoAND(new ValorBooleano(true), new ValorBooleano(true));
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		e.aceitar(t);
		System.out.println(t.getTamanho());
		Assert.assertEquals(3, t.getTamanho());
	}
	
	@Test 
	public void testOR(){
		Expressao e = new ExpressaoOR(new ValorBooleano(true), new ValorBooleano(true));
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		e.aceitar(t);
		System.out.println(t.getTamanho());	
		Assert.assertEquals(3, t.getTamanho());
	}
	
	@Test 
	public void testNOT(){
		Expressao e = new ExpressaoNOT(new ValorBooleano(true));
		
		TamanhoDasExpressoes t = new TamanhoDasExpressoes();	

		e.aceitar(t);
		System.out.println(t.getTamanho());	
		Assert.assertEquals(2, t.getTamanho());
	}

}
