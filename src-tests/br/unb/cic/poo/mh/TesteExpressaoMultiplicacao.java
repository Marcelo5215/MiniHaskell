package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoSoma;
import br.unb.poo.mh.Multiplicacao;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorBooleano;
import br.unb.poo.mh.ValorInteiro;

public class TesteExpressaoMultiplicacao {

	ValorInteiro v10 = new ValorInteiro(10);
	ValorInteiro v5 = new ValorInteiro(5);
	Expressao m = new Multiplicacao(v10, new ExpressaoSoma(v10, v5));
	
	@Test
	public void testeExpressaoOk() {
		Assert.assertEquals(new ValorInteiro(150), m.avaliar());
	}
	
	@Test
	public void testeExpressaoNok() {
		ValorInteiro v10 = new ValorInteiro(10);
		ValorBooleano vtrue = new ValorBooleano(true);
		
		Expressao m = new Multiplicacao(v10, new ExpressaoSoma(v10, vtrue));
		
		Assert.assertEquals(Tipo.Error, m.tipo());
	}
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Inteiro, m.tipo());
	}
}
