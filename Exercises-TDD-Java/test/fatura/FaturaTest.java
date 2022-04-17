package fatura;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;

public class FaturaTest {
	
	Fatura fatura;
	
	@BeforeEach
	public void inicializa() {
		fatura = new Fatura("José", 1500.00, new Date());
	}

}
