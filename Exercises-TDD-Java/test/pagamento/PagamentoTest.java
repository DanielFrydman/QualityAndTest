package pagamento;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;

public class PagamentoTest {
	
	Pagamento pagamento;
	
	@BeforeEach
	public void inicializa() {
		pagamento = new Pagamento(100.00, new Date(), "Boleto");
	}
	
}
