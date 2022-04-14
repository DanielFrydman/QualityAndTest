package processador;

public class ProcessadorDeBoletos {

	private String nome;
	private double preco;

	
	public ProcessadorDeBoletos(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object p) {
		return ((ProcessadorDeBoletos) p).getNome().equals(this.getNome());
	}
	
	
}
