package fatura;

import java.util.Date;

public class Fatura {
	
	private String nome_cliente;
	private double valor_total;
	private Date data;
	private boolean pago;
	
	public Fatura(String nome_cliente, double valor_total, Date data) {
		super();
		this.nome_cliente = nome_cliente;
		this.valor_total = valor_total;
		this.data = data;
		this.pago = false;
	}
	
}
