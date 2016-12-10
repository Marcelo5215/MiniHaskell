package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoOR;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorBooleano;

public class TesteExpressaoOR {

	private Expressao e = new ExpressaoOR(new ValorBooleano(true), new ValorBooleano(true));
	private Expressao e2 = new ExpressaoOR(new ValorBooleano(false), e);
	private Expressao e3 = new ExpressaoOR(new ValorBooleano(false), new ValorBooleano(true));
	private Expressao e4 = new ExpressaoOR(new ValorBooleano(false), new ValorBooleano(false));
	
	@Test
	public void testeORSimples() {
		Assert.assertEquals(new ValorBooleano(true), e.avaliar());
	}
	
	@Test
	public void testeORSimples2() {
		Assert.assertEquals(new ValorBooleano(true), e3.avaliar());
	}
	
	@Test
	public void testeORComplexa() {
		Assert.assertEquals(new ValorBooleano(true), e2.avaliar());
	}
	
	@Test
	public void testeORComplexa2() {
		Assert.assertEquals(new ValorBooleano(false), e4.avaliar());
	}
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Booleano, e.tipo());
	}
	

}
