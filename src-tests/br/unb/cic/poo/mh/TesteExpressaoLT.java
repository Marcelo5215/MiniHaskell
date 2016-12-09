package br.unb.cic.poo.mh;

import org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoLT;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.ValorInteiro;

@SuppressWarnings("unused")
public class TesteExpressaoLT {

	private Expressao e = new ExpressaoLT(new ValorInteiro(15), new ValorInteiro(15));
	private Expressao e2 = new ExpressaoLT(new ValorInteiro(15), new ValorInteiro(178));
	
	@Test
	public void testeEqual() {
		
		Assert.assertEquals(new ValorBooleano(false), e.avaliar());
	}
	
	@Test
	public void testeLT() {
		
		Assert.assertEquals(new ValorBooleano(true), e2.avaliar());
	}
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Booleano, e.tipo());
	}
	
}
