package br.unb.poo.mh;



import org.junit.Assert;
import org.junit.Test;

public class ExpressaoLTTest {

	private ValorInteiro v1 = new ValorInteiro(4);
	private ValorInteiro v2 = new ValorInteiro(8);
	private Expressao gt1 = new ExpressaoLT(v1, v2);
	private Expressao gt2 = new ExpressaoLT(v2, v1);
	
	
	
	@Test
	public void test() {
		ValorBooleano vb1 = new ValorBooleano(true);
		ValorBooleano vb2 = new ValorBooleano(false);
		
		Assert.assertEquals(vb1, gt1.avaliar());
		
		Assert.assertEquals(vb2, gt2.avaliar());
	}

}
