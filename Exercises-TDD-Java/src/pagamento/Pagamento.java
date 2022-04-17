package pagamento;

import java.util.Date;

public class Pagamento {
	
	private double valor;
	private Date data;
	private String tipo;
	
	public Pagamento(double valor, Date data, String tipo) {
		super();
		this.valor = valor;
		this.data = data;
		this.tipo = tipo;
	}

}
