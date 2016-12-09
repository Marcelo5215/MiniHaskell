package br.unb.poo.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ExpressaoORTest {

	private ValorBooleano vb1 = new ValorBooleano(true);
	private ValorBooleano vb2 = new ValorBooleano(false);
	
	private Expressao or1 = new ExpressaoOR(vb1, vb1);
	private Expressao or2 = new ExpressaoOR(vb2, vb2);
	private Expressao or3= new ExpressaoOR(vb2, vb1);
	private Expressao or4 = new ExpressaoOR(vb1, vb2);
	
	@Test
	public void testORfalse() {
		ValorBooleano vb3 = new ValorBooleano(false);
		Assert.assertEquals(vb3, or2.avaliar());
	}
	
	
	@Test
	public void testORtruw() {
		ValorBooleano vb3 = new ValorBooleano(true);
		Assert.assertEquals(vb3, or1.avaliar());
		Assert.assertEquals(vb3, or3.avaliar());
		Assert.assertEquals(vb3, or4.avaliar());
	}

}
