package boleto;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;

public class BoletoTest {
	
	Boleto boleto;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto(218083115, new Date(), 1500.00);
	}

}
