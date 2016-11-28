package br.unb.cic.poo.mh;

//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoDivisao;
import br.unb.poo.mh.ValorInteiro;

public class TesteExpressaoDivisao {

	private ValorInteiro v24 = new ValorInteiro(24);
	private ValorInteiro v2 = new ValorInteiro(2);
	private Expressao div = new ExpressaoDivisao(v24, v2);
	
	@Test
	public void testeDivisaoSimples() {
		ValorInteiro v12 = new ValorInteiro(12);
		Assert.assertEquals(v12, div.avaliar());
	}
	
	@Test
	public void testeDivisaoComplexa() {
		Expressao div2 = new ExpressaoDivisao(v24, div);
		Assert.assertEquals(v2, div2.avaliar());
	}
	
}
