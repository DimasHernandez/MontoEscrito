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
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Mil";

			} else {
				valorletras = "Mil ";
			}
			break;
		case "2":
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Dos Mil";

			} else {
				valorletras = "Dos Mil ";
			}
			break;
		case "3":
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Tres Mil";

			} else {
				valorletras = "Tres Mil ";
			}
			break;
		case "4":
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Cuatro Mil";

			} else {
				valorletras = "Cuatro Mil ";
			}
			break;
		case "5":
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Cinco Mil";

			} else {
				valorletras = "Cinco Mil ";
			}
			break;
		case "6":
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Seis Mil";

			} else {
				valorletras = "Seis Mil ";
			}
			break;
		case "7":
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Siete Mil";

			} else {
				valorletras = "Siete Mil ";
			}
			break;
		case "8":
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Ocho Mil";

			} else {
				valorletras = "Ocho Mil ";
			}
			break;
		case "9":
			if (valor.subSequence(1, 2).equals("0") && valor.subSequence(2, 3).equals("0")
					&& valor.subSequence(3, 4).equals("0")) {
				valorletras = "Nueve Mil";

			} else {
				valorletras = "Nueve Mil ";
			}
			break;

		}

		// Switch para las Centenas.
		switch (valor.substring(1, 2)) {
		case "1":
			if (valor.substring(2, 3).equals("0") && valor.substring(3, 4).equals("0")) {

				valorletras = valorletras + "Cien";
			} else {
				valorletras = valorletras + "Ciento ";
			}
			break;

		case "2":
			if (valor.subSequence(2, 3).equals("0") && valor.subSequence(3, 4).equals("0")) {
				valorletras = valorletras + "Doscientos";
			} else {
				valorletras = valorletras + "Doscientos ";
			}
			break;
		case "3":
			if (valor.subSequence(2, 3).equals("0") && valor.subSequence(3, 4).equals("0")) {
				valorletras = valorletras + "Trescientos";
			} else {
				valorletras = valorletras + "Trescientos ";
			}
			break;
		case "4":
			if (valor.subSequence(2, 3).equals("0") && valor.subSequence(3, 4).equals("0")) {
				valorletras = valorletras + "Cuatrocientos";
				}else{
					valorletras = valorletras + "Cuatrocientos ";
				}break;
		case "5":
			if (valor.subSequence(2, 3).equals("0") && valor.subSequence(3, 4).equals("0")) {
				valorletras = valorletras + "Quinientos";
				}else{
					valorletras = valorletras + "Quinientos ";
				}break;
		case "6":
			if (valor.subSequence(2, 3).equals("0") && valor.subSequence(3, 4).equals("0")) {
				valorletras = valorletras + "Seiscientos";
				}else{
					valorletras = valorletras + "Seiscientos ";
				}break;
		case "7":
			if (valor.subSequence(2, 3).equals("0") && valor.subSequence(3, 4).equals("0")) {
				valorletras = valorletras + "Setecientos";
				}else{
					valorletras = valorletras + "Setecientos ";
				}break;
		case "8":
			if (valor.subSequence(2, 3).equals("0") && valor.subSequence(3, 4).equals("0")) {
				valorletras = valorletras + "Ochocientos";
				}else{
					valorletras = valorletras + "Ochocientos ";
				}break;		
		case "9":
			if (valor.subSequence(2, 3).equals("0") && valor.subSequence(3, 4).equals("0")) {
				valorletras = valorletras + "Novecientos";
				}else{
					valorletras = valorletras + "Novecientos ";
				}break;

		}

		// Creacion switch para Decenas.

		switch (valor.substring(2, 3)) {

		case "1":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Diez";
			}
			if (valor.charAt(3) == '1') {
				valorletras = valorletras + "Once";
			}
			if (valor.charAt(3) == '2') {
				valorletras = valorletras + "Doce";
			}
			if (valor.charAt(3) == '3') {
				valorletras = valorletras + "Trece";
			}
			if (valor.charAt(3) == '4') {
				valorletras = valorletras + "Catorce";
			}
			if (valor.charAt(3) == '5') {
				valorletras = valorletras + "Quince";
			}
			if (valor.charAt(3) == '6') {
				valorletras = valorletras + "Dieci";
			}
			if (valor.charAt(3) == '7') {
				valorletras = valorletras + "Dieci";
			}
			if (valor.charAt(3) == '8') {
				valorletras = valorletras + "Dieci";
			}
			if (valor.charAt(3) == '9') {
				valorletras = valorletras + "Dieci";
			}
			break;

		case "2":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Veinte";
			} else {
				valorletras = valorletras + "Veinti ";
			}
			break;
		case "3":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Treinta";
			} else {
				valorletras = valorletras + "Treinta Y ";
			}
			break;
		case "4":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Cuarenta";
			} else {
				valorletras = valorletras + "Cuarenta Y ";
			}
			break;
		case "5":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Cincuenta";
			} else {
				valorletras = valorletras + "Cincuenta Y ";
			}
			break;
		case "6":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Sesenta";
			} else {
				valorletras = valorletras + "Sesenta Y ";
			}
			break;
		case "7":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Setenta";
			} else {
				valorletras = valorletras + "Setenta Y ";
			}
			break;
		case "8":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Ochenta";
			} else {
				valorletras = valorletras + "Ochenta Y ";
			}
			break;
		case "9":
			if (valor.charAt(3) == '0') {
				valorletras = valorletras + "Noventa";
			} else {
				valorletras = valorletras + "Noventa Y ";
			}
			break;

		}

		// switch para unidades.
		switch (valor.substring(3, 4)) {

		case "1":
			if (!valor.substring(2, 3).equals("1"))
				valorletras = valorletras + "Uno";
			break;
		case "2":
			if (!valor.substring(2, 3).equals("1"))
				valorletras = valorletras + "Dos";
			break;
		case "3":
			if (!valor.substring(2, 3).equals("1"))
				valorletras = valorletras + "Tres";
			break;
		case "4":
			if (!valor.substring(2, 3).equals("1"))
				valorletras = valorletras + "Cuatro";
			break;
		case "5":
			if (!valor.substring(2, 3).equals("1"))
				valorletras = valorletras + "Cinco";
			break;
		case "6":
			valorletras = valorletras + "Seis";
			break;
		case "7":
			valorletras = valorletras + "Siete";
			break;
		case "8":
			valorletras = valorletras + "Ocho";
			break;
		case "9":
			valorletras = valorletras + "Nueve";
			break;
		}

		return valorletras.toUpperCase();
	}

}
