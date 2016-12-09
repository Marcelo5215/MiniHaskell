package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Test;
import br.unb.poo.mh.*;
import junit.framework.Assert;

public class TesteIfThenElse {

	Expressao soma =  new ExpressaoSoma(new ValorInteiro(10), new ValorInteiro(5));
	Expressao subtracao = new ExpressaoSubtracao(new ValorInteiro(10), new ValorInteiro(5));
	Expressao ite = new IfThenElse(new ValorBooleano(true), soma, subtracao);
	Expressao ite2 = new IfThenElse(new ValorBooleano(false), soma, subtracao);
	
	@Test
	public void testITE(){
		Assert.assertEquals(new ValorInteiro(15), ite.avaliar());
	}
	
	@Test
	public void testITE2(){
		Assert.assertEquals(new ValorInteiro(5), ite2.avaliar());
	}
	
	@Test
	public void testeTipo(){
		Assert.assertEquals(Tipo.Inteiro, ite.tipo());
	}
	
}
