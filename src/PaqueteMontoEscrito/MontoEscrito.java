package PaqueteMontoEscrito;

//Creacion de clase.
public class MontoEscrito {

//Creacion del metodo.							
//un string es un arreglo, es una variable abstracta.
	public String ConvertirNumero(String valor) {

		String valorletras = "";

		// Esto es para agregarle la cantidad de ceros necesario para obtener el numero
		// completo.

		if (valor.length() == 3) {
			valor = "0" + valor;
		}
		if (valor.length() == 2) {
			valor = "00" + valor;
		}
		if (valor.length() == 1) {
			valor = "000" + valor;
		}

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
			if (valor.substring(2, 3).equals("0") && valor.substring(3, 4).equals("0")) {

				valorletras = "Cien";
			} else {
				valorletras = "Ciento";
			}
			break;

		case "2":
			valorletras = "Doscientos";
			break;
		case "3":
			valorletras = "Trescientos";
			break;
		case "4":
			valorletras = "Cuatrocientos";
			break;
		case "5":
			valorletras = "Quinientos";
			break;
		case "6":
			valorletras = "Seiscientos";
			break;
		case "7":
			valorletras = "Setecientos";
			break;
		case "8":
			valorletras = "Ochocientos";
			break;
		case "9":
			valorletras = "Novecientos";
			break;

		}

		// Creacion switch para Decenas.

		switch (valor.substring(2, 3)) {

		case "1":
			if (valor.charAt(3) == '0') {
				valorletras = "Diez";
			}
			if (valor.charAt(3) == '1') {
				valorletras = "Once";
			}
			if (valor.charAt(3) == '2') {
				valorletras = "Doce";
			}
			if (valor.charAt(3) == '3') {
				valorletras = "Trece";
			}
			if (valor.charAt(3) == '4') {
				valorletras = "Catorce";
			}
			if (valor.charAt(3) == '5') {
				valorletras = "Quince";
			}
			if (valor.charAt(3) == '6') {
				valorletras = "Dieciseis";
			}
			if (valor.charAt(3) == '7') {
				valorletras = "Diecisiete";
			}
			if (valor.charAt(3) == '8') {
				valorletras = "Dieciocho";
			}
			if (valor.charAt(3) == '9') {
				valorletras = "Diecinueve";
			}
			break;

		case "2":
			if (valor.charAt(3) == '0') {
				valorletras = "Veinte";
			} else {
				valorletras = "Veinti";
			}
			break;
		case "3":
			if (valor.charAt(3) == '0') {
				valorletras = "Treinta";
			} else {
				valorletras = "Treinta Y";
			}
			break;
		case "4":
			if (valor.charAt(3) == '0') {
				valorletras = "Cuarenta";
			} else {
				valorletras = "Cuarenta Y";
			}
			break;
		case "5":
			if (valor.charAt(3) == '0') {
				valorletras = "Cincuenta";
			} else {
				valorletras = "Cincuenta Y";
			}
			break;
		case "6":
			if (valor.charAt(3) == '0') {
				valorletras = "Sesenta";
			} else {
				valorletras = "Sesenta Y ";
			}
			break;
		case "7":
			if (valor.charAt(3) == '0') {
				valorletras = "Setenta";
			} else {
				valorletras = "Setenta Y";
			}
			break;
		case "8":
			if (valor.charAt(3) == '0') {
				valorletras = "Ochenta";
			} else {
				valorletras = "Ochenta Y";
			}
			break;
		case "9":
			if (valor.charAt(3) == '0') {
				valorletras = "Noventa";
			} else {
				valorletras = "Noventa Y";
			}
			break;

		}
		return valorletras;
	}
}
