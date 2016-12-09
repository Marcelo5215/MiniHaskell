package br.unb.cic.poo.mh;

import static org.junit.Assert.*;
import br.unb.poo.mh.*;
import junit.framework.Assert;

import org.junit.Test;

public class TesteExpressaoLet {

	Expressao let = new ExpressaoLet("x", new ValorInteiro(10),
			new ExpressaoSoma(
			new ExpressaoREF("x"),
			new ExpressaoREF("x")));
	
	@Test
	public void test() {
		Assert.assertEquals(new ValorInteiro(20), let.avaliar());
	}

	
	@Test
	public void testeExpressaoLetAninhada() {
		//let x = 5 in x + y
		ExpressaoLet letInterno = new ExpressaoLet("x", new ValorInteiro(5), 
				new ExpressaoSoma(new ExpressaoREF("x"), new ExpressaoREF("y")));  
	
		//let y = 10 in let x = 5 in x + y
		ExpressaoLet letExterno = new ExpressaoLet("y", new ValorInteiro(10), letInterno);
		
		
		assertEquals(new ValorInteiro(15), letExterno.avaliar());
	}
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Inteiro, let.tipo());
	}
	
}
