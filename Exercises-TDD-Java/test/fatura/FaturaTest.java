package fatura;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FaturaTest {
	
	Fatura fatura;
	
	@BeforeEach
	public void inicializa() {
		fatura = new Fatura("José", 1500.00, new Date());
	}
	
	@Test
	public void testGetNome() {
		String nomeCliente = fatura.getNome();

		Assertions.assertEquals(nomeCliente, "José");	
	}
	
	@Test
	public void testGetValorTotal() {
		double valorTotal = fatura.getValorTotal();

		Assertions.assertEquals(valorTotal, 1500.00);	
	}
	
	@Test
	public void testGetData() {
		Date data = fatura.getData();

		Assertions.assertEquals(data, new Date());	
	}
	
	@Test
	public void testGetPago() {
		boolean pago = fatura.getPago();

		Assertions.assertEquals(pago, false);	
	}
	
	@Test
	public void testSetPagoTrue() {
		fatura.setPagoTrue();
		boolean pago = fatura.getPago();

		Assertions.assertEquals(pago, true);	
	}

}
