package fatura;

import java.util.Date;

public class Fatura {
	
	private String nome_cliente;
	private double valor_total;
	private Date data;
	
	public Fatura(String nome_cliente, double valor_total, Date data) {
		super();
		this.nome_cliente = nome_cliente;
		this.valor_total = valor_total;
		this.data = data;
	}
	
	public String getNome() {
		return nome_cliente;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorTotal() {
		return valor_total;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object p) {
		return ((ProcessadorDeBoletos) p).getNome().equals(this.getNome());
	}
	
	
}
