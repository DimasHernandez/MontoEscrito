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
		String letrasesperadas = "tres mil cuatrocientos uno";
		// declaro variable valor obtenido
		String letrasobtenidas = PruebaMIles.ConvertirNumero("3401");
		// se hace la comparación
		System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas);
	}

	@Test
	void TestCentenas() {
		// Instanciar la clase MontoEscrito.
		MontoEscrito PruebaCentenas = new MontoEscrito();
		// Declaro variable valor esperado.
		String letrasesperadas = "Ciento uno";
		// Declaro variable valor obtenido.
		String letrasobtenidas = PruebaCentenas.ConvertirNumero("101");
		// Hago la comparacion.
		//System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas);

	}
	
	@Test
	void TestDecenas() {
		//Instanciar la clase MontoEscrito.
		MontoEscrito PruebaDecenas = new MontoEscrito();
		//Declaro Variable valor esperado.
		String letrasesperadas = "Diecisiete";
		//Declaro Variable valor esperado.
		String letrasobtenidas = PruebaDecenas.ConvertirNumero("17");
		//Hago una Comparacion.
		//System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas);
		
	}
	
	@Test
	void TestUnidades() {
		//Instanciar la clase MontoEscrito.
		MontoEscrito PruebaUnidades = new MontoEscrito();
		//Declaro variable valor esperado.
		String letrasesperadas = "Cinco";
		//Declaro variable valor esperado.
		String letrasobtenidas = PruebaUnidades.ConvertirNumero("5");
		//Hago una comparacion.
		//System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas); 
	}
	 
	
	//Esta Prueba No es Necesaria.
	/*@Test
	void TestFinal() {
		//Instanciar la clase MontoEscrito.
		MontoEscrito PruebaUnidades = new MontoEscrito();
		//Declaro variable valor esperado.
		String letrasesperadas = "Mil cien";
		//Declaro variable valor esperado.
		String letrasobtenidas = PruebaUnidades.ConvertirNumero("1100");
		//Hago una comparacion.
		System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas);
	}*/

}
