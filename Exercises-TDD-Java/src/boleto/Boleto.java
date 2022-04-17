package boleto;

import java.util.Date;

public class Boleto {
	
	private int codigoDoBoleto;
	private Date data;
	private double valorTotal;
	
	public Boleto(int codigoDoBoleto, Date data, double valorTotal) {
		super();
		this.codigoDoBoleto = codigoDoBoleto;
		this.data = data;
		this.valorTotal = valorTotal;
	}
	
	public int getCodigoDoBoleto() {
		return codigoDoBoleto;
	}
	
	public Date getData() {
		return data;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}

}
