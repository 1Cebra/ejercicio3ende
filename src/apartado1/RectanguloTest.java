package apartado1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	private Rectangulo r;
	
	@BeforeEach
	public void crearRectangulo() {
		r = new Rectangulo(3,2);
	}
	
	@AfterEach
	public void borrarRectangulo() {
		r = null;
	}
	
	@Test
	void testArea() {
		float valorEsperado = 6;
		float resultado = r.area();
		assertEquals(valorEsperado, resultado, 0, "Fallo en el área");
	}

}
