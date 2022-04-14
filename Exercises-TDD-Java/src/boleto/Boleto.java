package boleto;

import java.util.ArrayList;
import java.util.Iterator;

import processador.ProcessadorDeBoletos;
import processador.ProcessadorDeBoletos;

public class Boleto {
	
	private ArrayList items;
	
	public Boleto() {
		items = new ArrayList();
	}
	
	public double getValorTotal() {
		double valorTotal = 0.0;
		
		for (Iterator i = items.iterator(); i.hasNext();) {
			ProcessadorDeBoletos item = (ProcessadorDeBoletos) i.next();
			valorTotal += item.getPreco();
		}
		
		return valorTotal;
	}
	
	public void addItem(ProcessadorDeBoletos item) {
		items.add(item);
	}
	
	public void removeItem(ProcessadorDeBoletos item) throws ProdutoNaoEncontradoException {
		if (!items.remove(item)) {
			throw new ProdutoNaoEncontradoException();
		}
	}
	
	public int getQtdeItems() {
		return items.size();
	}
	
	public void esvazia() {
		items.clear();
	}
	

}
