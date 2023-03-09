package apartado2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadesFechaTest {

	@Test
	void testSolicitarAnio_true() {
		boolean valorEsperado = true;
		boolean resultado = UtilidadesFecha.comprobarBisiesto(2024);
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	void testSolicitarAnio_false() {
		boolean valorEsperado = false;
		boolean resultado = UtilidadesFecha.comprobarBisiesto(2023);
		assertEquals(valorEsperado, resultado);
	}
}
