package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Classe para teste do carrinho")
public class CarrinhoTest {
	
	Carrinho carrinho;
	Produto livro1;
	Produto livro2;
	Produto livro3;

	@BeforeEach
	public void inicializa() {
		livro1 = new Produto("Introdução ao Teste de Software", 100.00);
		livro2 = new Produto("Teste de Software Avançado", 250.00);
		carrinho = new Carrinho();
		carrinho.addItem(livro1);
		carrinho.addItem(livro2);
	}
	
	@Test
	public void testQuantidadeDeItens() {
		int qnt = carrinho.getQtdeItems();
		Assertions.assertEquals(2, qnt);		
	}

	@Test
	public void testAddItem() {
		carrinho.addItem(livro2);		
		int qnt = carrinho.getQtdeItems();
		Assertions.assertEquals(3, qnt);		
	}
	
	@Test
	public void testPegarValorTotal() {
		double valor = carrinho.getValorTotal();
		Assertions.assertEquals(350, valor);		
	}
	
	@Test
	public void testRemoverItem() {
		try {
			carrinho.removeItem(livro2);
			int qnt = carrinho.getQtdeItems();
			Assertions.assertEquals(1, qnt);
		}catch (ProdutoNaoEncontradoException e) {
			int qnt = carrinho.getQtdeItems();
			Assertions.assertEquals(2, qnt);
		}		
	}
	
	@Test
	public void testRemoverItemInexistente() {
		try {
			carrinho.removeItem(livro3);
			int qnt = carrinho.getQtdeItems();
			Assertions.assertEquals(1, qnt);
		}catch (ProdutoNaoEncontradoException e) {
			int qnt = carrinho.getQtdeItems();
			Assertions.assertEquals(2, qnt);
		}		
	}
	
	@Test
	public void testEsavaziar() {
		carrinho.esvazia();
		int qnt = carrinho.getQtdeItems();
		Assertions.assertEquals(0, qnt);		
	}
	
}
