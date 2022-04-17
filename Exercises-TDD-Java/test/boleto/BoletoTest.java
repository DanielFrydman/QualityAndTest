package boleto;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoletoTest {
	
	Boleto boleto;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto(218083115, new Date(), 450.00);
	}
	
	@Test
	public void testGetCodigoDoBoleto() {
		int codigoDoBoleto = boleto.getCodigoDoBoleto();

		Assertions.assertEquals(codigoDoBoleto, 218083115);	
	}
	
	@Test
	public void testGetData() {
		Date data = boleto.getData();

		Assertions.assertEquals(data, new Date());	
	}
	
	@Test
	public void testGetValorTotal() {
		double valorTotal = boleto.getValorTotal();

		Assertions.assertEquals(valorTotal, 450.00);	
	}

}
