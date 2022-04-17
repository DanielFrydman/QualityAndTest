package pagamento;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PagamentoTest {
	
	Pagamento pagamento;
	
	@BeforeEach
	public void inicializa() {
		pagamento = new Pagamento(100.00, new Date(), "Boleto");
	}
	
	@Test
	public void testGetPreco() {
		double valor = pagamento.getValor();

		Assertions.assertEquals(valor, 100.00);	
	}
	
	@Test
	public void testGetData() {
		Date data = pagamento.getData();

		Assertions.assertEquals(data, new Date());	
	}
	
	@Test
	public void testGetTipo() {
		String tipo = pagamento.getTipo();

		Assertions.assertEquals(tipo, "Boleto");	
	}
	
}
