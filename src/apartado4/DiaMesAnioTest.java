package apartado4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiaMesAnioTest {
	
	@Test
	void calcularDiasMesAnio_Febrero() {
		int valorEsperado=28;
		int resultado=DiaMesAnio.calcularDiasMesAnio(2, 2023);
		assertEquals(valorEsperado, resultado, 0, "Error al calcular los días.");
	}
	
	@Test
	void calcularDiasMesAnio_FebreroBisiesto() {
		int valorEsperado=29;
		int resultado=DiaMesAnio.calcularDiasMesAnio(2, 2024);
		assertEquals(valorEsperado, resultado, 0, "Error al calcular los días.");
	}
	
	@Test
	void calcularDiasMesAnio_Mes30() {
		int valorEsperado=30;
		int resultado=DiaMesAnio.calcularDiasMesAnio(4, 2023);
		assertEquals(valorEsperado, resultado, 0, "Error al calcular los días.");
	}
	
	@Test
	void calcularDiasMesAnio_Mes31() {
		int valorEsperado=31;
		int resultado=DiaMesAnio.calcularDiasMesAnio(5, 2023);
		assertEquals(valorEsperado, resultado, 0, "Error al calcular los días.");
	}
	

}
