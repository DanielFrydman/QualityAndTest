package fatura;

import java.util.Date;

public class Fatura {
	
	private String nomeCliente;
	private double valorTotal;
	private Date data;
	private boolean pago;
	
	public Fatura(String nomeCliente, double valorTotal, Date data) {
		super();
		this.nomeCliente = nomeCliente;
		this.valorTotal = valorTotal;
		this.data = data;
		this.pago = false;
	}
	
}
