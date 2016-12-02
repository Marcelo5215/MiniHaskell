package br.unb.poo.mh;



import org.junit.Assert;
import org.junit.Test;

public class ExpressaoGTTest {
	private ValorInteiro v1 = new ValorInteiro(9);
	private ValorInteiro v2 = new ValorInteiro(7);
	private Expressao gt1 = new ExpressaoGT(v1, v2);
	private Expressao gt2 = new ExpressaoGT(v2, v1);
	
	
	
	
	@Test
	public void test() {
		ValorBooleano vb1 = new ValorBooleano(true);
		ValorBooleano vb2 = new ValorBooleano(false);
		
		Assert.assertEquals(vb1, gt1.avaliar());
		
		Assert.assertEquals(vb2, gt2.avaliar());
		
	}

}
