package br.unb.poo.mh;



import org.junit.Assert;
import org.junit.Test;

public class ExpressaoEqualTest {
	private ValorInteiro v2a = new ValorInteiro(2);
	private ValorInteiro v2b = new ValorInteiro(2);
	private ValorInteiro v3 = new ValorInteiro(3);
	
	private Expressao equal = new ExpressaoEqual(v2a, v2b);
	private Expressao equal2 = new ExpressaoEqual(v2a, v3);
			
			
			@Test
	public void testEqual() {
				ValorBooleano v = new ValorBooleano(true);
				ValorBooleano v1 = new ValorBooleano(false);
				
				Assert.assertEquals(v , equal.avaliar());
				Assert.assertEquals(v1 , equal2.avaliar());
				
	}


}

