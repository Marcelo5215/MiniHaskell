package br.unb.cic.poo.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import br.unb.poo.mh.ValorDecimal;
public class TesteValorDecimal {
	
	
	private ValorDecimal v5 = new ValorDecimal(1.5);

	@Test
	public void testeSimples() {
		Assert.assertEquals(v5, v5);
	}
	
}
