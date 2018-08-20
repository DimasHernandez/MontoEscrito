package PaqueteMontoEscrito;

//Creacion de clase.
public class MontoEscrito {

//Creacion del metodo.							
//un string es un arreglo, es una variable abstracta.
	public String ConvertirNumero(String valor) {

		String valorletras = "";

		// switch para los miles.
		// El Substring me toma el valor de cierta posicion determinada del vector.

		switch (valor.substring(0, 1)) {

		case "1":
			valorletras = "Mil";
			break;
		case "2":
			valorletras = "Dos mil";
			break;
		case "3":
			valorletras = "Tres mil";
			break;
		case "4":
			valorletras = "Cuatro mil";
			break;
		case "5":
			valorletras = "Cinco mil";
			break;
		case "6":
			valorletras = "Seis mil";
			break;
		case "7":
			valorletras = "Siete mil";
			break;
		case "8":
			valorletras = "Ocho mil";
			break;
		case "9":
			valorletras = "Nueve mil";
			break;

		}

		// Switch para las Centenas.
		switch (valor.substring(1, 2)) {
		case "1":
			if (valor.charAt(2) == '0' && valor.charAt(3) == '0') {
				
				valorletras = " Cien ";
			} else {
				valorletras = " Ciento ";
			}break;

		case "2":
			valorletras = " Doscientos ";
			break;
		case "3":
			valorletras = " Trescientos ";
			break;
		case "4":
			valorletras = " Cuatrocientos ";
			break;
		case "5":
			valorletras = " Quinientos ";
			break;
		case "6":
			valorletras = " Seiscientos ";
			break;
		case "7":
			valorletras = " Setecientos ";
			break;
		case "8":
			valorletras = " Ochocientos ";
			break;
		case "9":
			valorletras = " Novecientos ";
			break;

		}
		return valorletras;
	}
}
