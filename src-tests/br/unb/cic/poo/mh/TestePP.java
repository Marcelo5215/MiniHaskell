package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Test;

import br.unb.poo.mh.*;

public class TestePP {

	@Test
	public void testSoma() {
		ValorInteiro v5 = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		Expressao soma = new ExpressaoSoma(v5, v10);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		soma.aceitar(pp);
		
	}
	
	@Test
	public void testDivisao(){
		ValorInteiro v24 = new ValorInteiro(24);
		ValorInteiro v2 = new ValorInteiro(2);
		Expressao div = new ExpressaoDivisao(v24, v2);
		 
		PrettyPrinter pp = new PrettyPrinter();
			
		div.aceitar(pp);
			
	}
	
	@Test 
	public void testSubtracao(){
		ValorInteiro v23 = new ValorInteiro(23);
		ValorInteiro v2 = new ValorInteiro(2);
		Expressao subtracao = new ExpressaoSubtracao(v23, v2);
		
		PrettyPrinter pp = new PrettyPrinter();
		
		subtracao.aceitar(pp);
			
	}
	
	@Test 
	public void testMultiplicao(){
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v5 = new ValorInteiro(5);
		Expressao m = new Multiplicacao(v10, new ExpressaoSoma(v10, v5));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		m.aceitar(pp);
		
	}
	
	@Test 
	public void testGT(){
		Expressao e = new ExpressaoGT(new ValorInteiro(15), new ValorInteiro(15));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		e.aceitar(pp);
		
	}
	
	@Test 
	public void testGTE(){
		Expressao e = new ExpressaoGTE(new ValorInteiro(15), new ValorInteiro(5));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		e.aceitar(pp);	
	}
	
	@Test 
	public void testLT(){
		Expressao e = new ExpressaoGTE(new ValorInteiro(15), new ValorInteiro(5));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		e.aceitar(pp);	
	}
	
	@Test 
	public void testLTE(){
		Expressao e = new ExpressaoLTE(new ValorInteiro(15), new ValorInteiro(5));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		e.aceitar(pp);	
	}
	
	@Test 
	public void testAND(){
		Expressao e = new ExpressaoAND(new ValorBooleano(true), new ValorBooleano(true));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		e.aceitar(pp);	
	}
	
	@Test 
	public void testOR(){
		Expressao e = new ExpressaoOR(new ValorBooleano(true), new ValorBooleano(true));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		e.aceitar(pp);	
	}
	
	@Test 
	public void testNOT(){
		Expressao e = new ExpressaoNOT(new ValorBooleano(true));
		
		PrettyPrinter pp = new PrettyPrinter();
		
		e.aceitar(pp);	
	}
	


}
