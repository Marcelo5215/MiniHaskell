package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoEqual;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;

@SuppressWarnings("unused")
public class TesteExpressaoEqual {

	Expressao e = new ExpressaoEqual(new ValorInteiro(15), new ValorInteiro(15));
	
	@Test
	public void testeEqual() {
		
		Assert.assertEquals(new ValorBooleano(true), e.avaliar());
		Assert.assertNotEquals(new ValorBooleano(false), e.avaliar());
	}
	
	@Test
	public void testeEqualBooleano() {

		Expressao e2 = new ExpressaoEqual(new ValorBooleano(false), e);
		
		Assert.assertEquals(new ValorBooleano(false), e2.avaliar());
	}
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Booleano, e.tipo());
	}
}
