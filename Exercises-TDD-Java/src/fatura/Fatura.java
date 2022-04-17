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
	
	public String getNome() {
		return nomeCliente;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public Date getData() {
		return data;
	}

	public boolean getPago() {
		return pago;
	}
	
	public void setPagoTrue() {
		this.pago = true;
	}
	
}
