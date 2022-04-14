package produto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
	
	Produto livro;
	
	@BeforeEach
	public void inicializa() {
		livro = new Produto("Introdução ao Teste de Software", 100.00);
	}
	
	@Test
	public void testCriaProduto() {
		Assertions.assertAll("livro",
				() -> assertEquals("Introdução ao Teste de Software", livro.getNome()),
				() -> assertTrue(100.00 == livro.getPreco())						
				);
	}
	
	@Test
	public void testProdutosIguais() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 90.00);
		
		assertNotSame(livro, livro2);
		
	}
	
	@Test
	public void assertionComHamcrestMatcher() {
		assertThat(livro.getPreco(), equalTo(100.00));
		assertThat(livro.getNome(), notNullValue());
		assertThat(livro.getNome(), containsString("Teste"));
		assertThat(livro, instanceOf(Produto.class));
	}
	
	@Test
	public void testDefinirPreco() {
		livro.setPreco(50);
		double preco = livro.getPreco();

		Assertions.assertEquals(preco, 50);	
	}
	
	@Test
	public void testDefinirNome() {
		livro.setNome("Teste de Software - Básico ao avançado");
		String nome = livro.getNome();

		Assertions.assertEquals(nome, "Teste de Software - Básico ao avançado");	
	}
	
	@Test
	public void testProdutosDiferentes() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 90.00);
		
		Assertions.assertTrue(livro != livro2);
	}
	
	@Test
	public void testProdutosIdenticos() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 100.00);
		
		Assertions.assertEquals(livro, livro2);
	}
	
	@Test
	public void testNomeDosProdutosIdenticos() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 100.00);
		String nome1 = livro.getNome();
		String nome2 = livro2.getNome();
		
		Assertions.assertTrue(nome1 == nome2);
	}
	
	@Test
	public void testPrecoDosProdutosIdenticos() {
		Produto livro2 = new Produto("Introdução ao Teste de Software", 100.00);
		double preco1 = livro.getPreco();
		double preco2 = livro2.getPreco();
		
		Assertions.assertTrue(preco1 == preco2);
	}

}
