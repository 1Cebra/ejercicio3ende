package apartado3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void calcularFactorialTest_NumeroPositivo() {
		long valorEsperado = 6;
		long resultado = Factorial.calcularFactorial(3);
		assertEquals(valorEsperado, resultado, 0, "Error en el factorial");
	}

	@Test
	void calcularFactorialTest_NumeroNegativo() {
		long valorEsperado = -1;
		long resultado = Factorial.calcularFactorial(-3);
		assertEquals(valorEsperado, resultado, 0, "Error en el factorial");
	}

	@Test
	void calcularFactorialTest_Cero() {
		long valorEsperado = 1;
		long resultado = Factorial.calcularFactorial(0);
		assertEquals(valorEsperado, resultado, 0, "Error en el factorial");
	}

	@Test
	void calcularFactorialRecursivoTest_NumeroPositivo() {
		long valorEsperado = 6;
		long resultado = Factorial.calcularFactorialRecursivo(3);
		assertEquals(valorEsperado, resultado, 0, "Error en el factorial");
	}
	
	@Test
	void calcularFactorialRecursivoTest_NumeroNegativo() {
		long valorEsperado = -1;
		long resultado = Factorial.calcularFactorialRecursivo(-3);
		assertEquals(valorEsperado, resultado, 0, "Error en el factorial");
	}
	
	@Test
	void calcularFactorialRecursivoTest_Uno() {
		long valorEsperado = 1;
		long resultado = Factorial.calcularFactorialRecursivo(1);
		assertEquals(valorEsperado, resultado, 0, "Error en el factorial");
	}
	
	@Test
	void calcularFactorialRecursivoTest_Cero() {
		long valorEsperado = 0;
		long resultado = Factorial.calcularFactorialRecursivo(0);
		assertEquals(valorEsperado, resultado, 0, "Error en el factorial");
	}
}
