package processador;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class ProcessadorDeBoletosTest {
	
	ProcessadorDeBoletos processador;
	Boleto boleto1;
	Boleto boleto2;
	Boleto boleto3;
	Fatura fatura;
	Pagamento pagamento;
	
	@BeforeEach
	public void inicializa() {
		boleto1 = new Boleto(218083115, new Date(), 500.00);
		boleto2 = new Boleto(218083116, new Date(), 400.00);
		boleto3 = new Boleto(218083117, new Date(), 600.00);
		Boleto[] arrayBoletos;
		arrayBoletos = new Boleto[3];
		arrayBoletos[0] = boleto1;
		arrayBoletos[1] = boleto2;
		arrayBoletos[2] = boleto3;
		fatura = new Fatura("José", 1500.00, new Date());
		Pagamento[] arrayPagamentos;
		arrayPagamentos = new Pagamento[3];
		
		processador = new ProcessadorDeBoletos(arrayBoletos, fatura, arrayPagamentos);
	}
	
}
