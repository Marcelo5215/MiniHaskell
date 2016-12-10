package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoNOT;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorBooleano;

public class TesteExpressaoNOT {

	private Expressao e = new ExpressaoNOT(new ValorBooleano(true));
	private Expressao e2 = new ExpressaoNOT( e);
	
	@Test
	public void testeNOTSimples() {
		
		Assert.assertEquals(new ValorBooleano(false), e.avaliar());
	}
	
	@Test
	public void testeNOTComplexa() {
		Assert.assertEquals(new ValorBooleano(true), e2.avaliar());
	}
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Booleano, e.tipo());
	}
}
