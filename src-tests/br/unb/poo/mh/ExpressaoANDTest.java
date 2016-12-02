package br.unb.poo.mh;



import org.junit.Assert;
import org.junit.Test;

public class ExpressaoANDTest {
	
	private ValorBooleano vb1 = new ValorBooleano(true);
	private ValorBooleano vb2 = new ValorBooleano(false); 
	private Expressao and1 = new ExpressaoAND(vb1, vb2);
	private Expressao and2 = new ExpressaoAND(vb1, vb1);
	private Expressao and3 = new ExpressaoAND(vb2, vb2);
	
	
	@Test
	public void testANDsimples() {
		ValorBooleano vb3 = new ValorBooleano(true);
		ValorBooleano vb4 = new ValorBooleano(false);
		
		Assert.assertEquals(vb4, and1.avaliar());
		Assert.assertEquals(vb3, and2.avaliar());
		Assert.assertEquals(vb4, and3.avaliar());
	}
	@Test
	public void testANDcomplexo() {
		
		
		Assert.assertEquals(and1.avaliar(), and3.avaliar());
		
		
	}

}
