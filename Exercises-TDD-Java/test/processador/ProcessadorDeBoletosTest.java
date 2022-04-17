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
		int quantidadeDeBoletos = processador.getQuantidadeDeBoletos();

		Assertions.assertEquals(quantidadeDeBoletos, 3);
	}
	
	@Test
	public void testGetQuantidadeDePagamentosInicial() {
		int quantidadeDePagamentos = processador.getQuantidadeDePagamentos();

		Assertions.assertEquals(quantidadeDePagamentos, 0);
	}
	
	@Test
	public void testGetValorTotalBoletos() {
		double valorTotalBoletos = processador.getValorTotalBoletos();

		Assertions.assertEquals(valorTotalBoletos, 1500.00);
	}
	
	@Test
	public void testCriarPagamentos() {
		processador.criarPagamentos();
		int quantidadeDePagamentos = processador.getQuantidadeDePagamentos();

		Assertions.assertEquals(quantidadeDePagamentos, 3);
	}
	
	@Test
	public void testAddPagamentoNaLista() {
		Pagamento pagamento = new Pagamento(100.00, new Date(), "Boleto");
		processador.addPagamentoNaLista(pagamento);
		int quantidadeDePagamentos = processador.getQuantidadeDePagamentos();

		Assertions.assertEquals(quantidadeDePagamentos, 1);
	}
	
	@Test
	public void testGetListaPagamento() {
		ArrayList<Pagamento> array = processador.getListaPagamentos();

		Assertions.assertEquals(array, arrayPagamentos);	
	}
	
	@Test
	public void testChecarPagamento() {
		processador.criarPagamentos();
		boolean pago = fatura.getPago();

		Assertions.assertEquals(pago, true);	
	}
	
	@Test
	public void testFaturaNaoPaga() {
		boolean pago = fatura.getPago();

		Assertions.assertEquals(pago, false);	
	}
	
}







