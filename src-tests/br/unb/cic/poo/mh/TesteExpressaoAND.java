package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoAND;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorBooleano;

public class TesteExpressaoAND {


	private Expressao e = new ExpressaoAND(new ValorBooleano(true), new ValorBooleano(true));
	private Expressao e2 = new ExpressaoAND(new ValorBooleano(false), e);
	
	@Test
	public void testeDivisaoSimples() {
		
		Assert.assertEquals(new ValorBooleano(true), e.avaliar());
	}
	
	@Test
	public void testeDivisaoComplexa() {
		Assert.assertEquals(new ValorBooleano(false), e2.avaliar());
	}
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Booleano, e.tipo());
	}
	
}
