package ejercicio1;

public class Validaciones {
	public static boolean verificarDniInvalido(String dni) throws DniInvalido, NumberFormatException {
		// // validamos que s�lo tengo 8 d�gitos entre los 8 primeros caracteres y que
		// la letra introducida es igual a la de la ecuaci�n
		// // Llamamos a los m�todos privados de la clase soloNumeros() y letraDNI()
		// if(soloNumeros(dni) == true ) {
		// return true;
		// }
		// else {
		// return false;
		// }
		try {
			int dni_ = Integer.parseInt(dni);
			if (String.valueOf(dni_).length() == 7 || String.valueOf(dni_).length() == 8)
				return true;
		} catch (DniInvalido e) {
			throw new DniInvalido();
		} catch (NumberFormatException e) {
			throw new NumberFormatException();
		}
		throw new 
	}

	// este metodo lo discontinuamos por la solucion aplicada por german para
	// chequear el dni

	private static boolean soloNumeros(String dni) {

		int i, j = 0;
		String numero = ""; /*
							 * Es el n�mero que se comprueba uno a uno por si hay alguna letra entre los 8
							 * primeros d�gitos
							 */
		String miDNI = ""; // Guardamos en una cadena los n�meros para despu�s calcular la letra
		String[] unoNueve = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (i = 0; i < dni.length() - 1; i++) {
			numero = dni.substring(i, i + 1);

			for (j = 0; j < unoNueve.length; j++) {
				if (numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if (miDNI.length() != 8) {
			return false;
		} else {
			return true;
		}
	}
}
