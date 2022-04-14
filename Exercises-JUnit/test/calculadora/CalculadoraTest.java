package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
	
	@Test
	public void testSubtracaoDoisNumeros() {
		int subtracao = calc.subtracao(5, 4);		
		Assertions.assertEquals(1, subtracao);		
	}
	
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int multiplicacao = calc.multiplicacao(5, 4);		
		Assertions.assertEquals(20, multiplicacao);		
	}
	
	@Test
	public void testSomatoria() {
		int somatoria = calc.somatoria(5);		
		Assertions.assertEquals(15, somatoria);		
	}
	
	@Test
	public void testEhPositivo1() {
		boolean ehPositivo = calc.ehPositivo(5);		
		Assertions.assertEquals(true, ehPositivo);
	}

	@Test
	public void testEhPositivo2() {
		boolean ehPositivo = calc.ehPositivo(-5);		
		Assertions.assertEquals(false, ehPositivo);
	}

	@Test
	public void testCompara1() {
		int compara = calc.compara(5, 5);		
		Assertions.assertEquals(0, compara);		
	}
	
	@Test
	public void testCompara2() {
		int compara = calc.compara(5, 4);		
		Assertions.assertEquals(1, compara);		
	}
	
	@Test
	public void testCompara3() {
		int compara = calc.compara(4, 5);		
		Assertions.assertEquals(-1, compara);		
	}

}
