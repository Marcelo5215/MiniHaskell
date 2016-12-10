package br.unb.cic.poo.mh;

//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoSubtracao;
import br.unb.poo.mh.Tipo;
import br.unb.poo.mh.ValorInteiro;

public class TesteExpressaoSubtracao {

	private ValorInteiro v23 = new ValorInteiro(23);
	private ValorInteiro v2 = new ValorInteiro(2);
	private Expressao subtracao = new ExpressaoSubtracao(v23, v2);
	
	@Test
	public void testeSubtracaoSimples() {
		ValorInteiro v21 = new ValorInteiro(21);
		Assert.assertEquals(v21, subtracao.avaliar());
	}
	
	@Test
	public void testeSubtracaoComplexa() {
		Expressao subtracao2 = new ExpressaoSubtracao(v23, subtracao);
		Assert.assertEquals(v2, subtracao2.avaliar());
	}
	
	
	@Test
	public void testeTipo() {
		Assert.assertEquals(Tipo.Inteiro, subtracao.tipo());
	}
}
