package br.unb.poo.mh;



import org.junit.Assert;
import org.junit.Test;

public class ExpressaoLTETest {
	private ValorInteiro v1 = new ValorInteiro(4);
	private ValorInteiro v2 = new ValorInteiro(4);
	private ValorInteiro v3 = new ValorInteiro(9);
	private Expressao gt1 = new ExpressaoLTE(v1, v3);
	private Expressao gt2 = new ExpressaoLTE(v1, v2);
	private Expressao gt3 = new ExpressaoLTE(v3, v1);
	
	
	@Test
	public void test() {
		ValorBooleano vb1 = new ValorBooleano(true);
		ValorBooleano vb2 = new ValorBooleano(false);
		
		Assert.assertEquals(vb1, gt1.avaliar());
		
		Assert.assertEquals(vb1, gt2.avaliar());
		
		Assert.assertEquals(vb2, gt3.avaliar());
		
	}

}
