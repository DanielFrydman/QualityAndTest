package processador;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class ProcessadorDeBoletosTest {
	
	ProcessadorDeBoletos processador;
	ArrayList<Boleto> arrayBoletos;
	Fatura fatura;
	ArrayList<Pagamento> arrayPagamentos;
	
	@BeforeEach
	public void inicializa() {
		Boleto boleto1 = new Boleto(218083115, new Date(), 500.00);
		Boleto boleto2 = new Boleto(218083116, new Date(), 400.00);
		Boleto boleto3 = new Boleto(218083117, new Date(), 600.00);
		arrayBoletos = new ArrayList<Boleto>();
		arrayBoletos.add(boleto1);
		arrayBoletos.add(boleto2);
		arrayBoletos.add(boleto3);
		fatura = new Fatura("José", 1500.00, new Date());
		arrayPagamentos = new ArrayList<Pagamento>();
		
		processador = new ProcessadorDeBoletos(arrayBoletos, fatura, arrayPagamentos);
	}
	
	@Test
	public void testGetListaBoletos() {
		ArrayList<Boleto> array = processador.getListaBoletos();

		Assertions.assertEquals(array, arrayBoletos);	
	}
	
	@Test
	public void testGetQuantidadeDeBoletos() {
	}
	
	@Test
	public void testGetQuantidadeDePagamentos() {
	}
	
	@Test
	public void testGetValorTotalBoletos() {
	}
	
	@Test
	public void testCriarPagamentos() {
	}
	
	@Test
	public void testAddPagamentoNaLista() {
	}
	
	@Test
	public void testChecarPagamento() {
	}
	
}







