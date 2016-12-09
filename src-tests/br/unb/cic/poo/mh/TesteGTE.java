package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoGTE;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.ValorInteiro;

public class TesteGTE {

	private Expressao e = new ExpressaoGTE(new ValorInteiro(15), new ValorInteiro(15));
	private Expressao e2 = new ExpressaoGTE(new ValorInteiro(25), new ValorInteiro(15));
	
	@Test
	public void testeEqual() {
		
		Assert.assertEquals(new ValorBooleano(true), e.avaliar());
	}
	
	@Test
	public void testeGT() {
		
		Assert.assertEquals(new ValorBooleano(true), e2.avaliar());
	}
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Booleano, e.tipo());
	}
	
}
