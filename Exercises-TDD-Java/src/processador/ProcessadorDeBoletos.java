package processador;

import java.util.ArrayList;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class ProcessadorDeBoletos {
	
	private ArrayList<Boleto> boletos;
	private Fatura fatura;
	private ArrayList<Pagamento> pagamentos;

	public ProcessadorDeBoletos(ArrayList<Boleto> boletos, Fatura fatura, ArrayList<Pagamento> pagamentos) {
		this.boletos = boletos;
		this.fatura = fatura;
		this.pagamentos = pagamentos;
	}
	
	public ArrayList<Boleto> getListaBoletos() {
		return boletos;
	}
 
	public int getQuantidadeDeBoletos() {
		return boletos.size();
	}
	
	public int getQuantidadeDePagamentos() {
		return pagamentos.size();
	}
	
	public double getValorTotalBoletos() {
		ArrayList<Boleto> lista = getListaBoletos();
		double valorTotal = 0;
		for (int i = 0; i < getQuantidadeDeBoletos(); i++) {
			Boleto boleto = lista.get(i);
			valorTotal += boleto.getValorTotal();
		}
		return valorTotal;
	}
	
}
