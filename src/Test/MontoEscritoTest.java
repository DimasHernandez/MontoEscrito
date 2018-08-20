package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import PaqueteMontoEscrito.MontoEscrito;

class MontoEscritoTest {

	@Test
	void TestMiles() {
		// Instanciar la clase MontoEscrito
		MontoEscrito PruebaMIles = new MontoEscrito();
		// declaro variable valor esperado
		String letrasesperadas = "Nueve mil";
		// declaro variable valor obtenido
		String letrasobtenidas = PruebaMIles.ConvertirNumero("9000");
		// se hace la comparación
		//System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);
	}

	@Test
	void TestCentenas() {
		// Instanciar la clase MontoEscrito.
		MontoEscrito PruebaCentenas = new MontoEscrito();
		// Declaro variable valor esperado.
		String letrasesperadas = " Ciento ";
		// Declaro variable valor obtenido.
		String letrasobtenidas = PruebaCentenas.ConvertirNumero(" 199 ");
		// Hago la comparacion.
		System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}

}
