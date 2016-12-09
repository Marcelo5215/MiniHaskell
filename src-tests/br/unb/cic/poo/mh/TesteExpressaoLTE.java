package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoLTE;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.ValorInteiro;

public class TesteExpressaoLTE {

	private Expressao e = new ExpressaoLTE(new ValorInteiro(15), new ValorInteiro(15));
	private Expressao e2 = new ExpressaoLTE(new ValorInteiro(0), new ValorInteiro(15));
	
	@Test
	public void testeEqual() {		
		Assert.assertEquals(new ValorBooleano(true), e.avaliar());
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
