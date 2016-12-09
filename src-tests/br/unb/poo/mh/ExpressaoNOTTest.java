package br.unb.poo.mh;


import org.junit.Assert;
import org.junit.Test;

public class ExpressaoNOTTest {
	
	private ValorBooleano vb1 = new ValorBooleano(true);
	private ValorBooleano vb2 = new ValorBooleano(false);
	private Expressao not1 = new ExpressaoNOT(vb1);
	private Expressao not2 = new ExpressaoNOT(vb2);
	
	@Test
	public void testNOTtrue() {
		
		ValorBooleano vb3 = new ValorBooleano(false);
		Assert.assertEquals(vb3, not1.avaliar());
		
		
	}
	
	
	@Test
	public void testNOTfalse() {
		
		ValorBooleano vb4 = new ValorBooleano(true);
		Assert.assertEquals(vb4, not2.avaliar());
		
		
	}

}
