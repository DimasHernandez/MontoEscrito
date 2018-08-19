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
		String letrasesperadas = "Mil";
		// declaro variable valor obtenido
		String letrasobtenidas = PruebaMIles.ConvertirNumero("1000");
		// se hace la comparación
		System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);
	}

}
