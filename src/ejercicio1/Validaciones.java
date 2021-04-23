package ejercicio1;

public class Validaciones {
	public static boolean verificarDniInvalido(String dni) {
		// validamos que sólo tengo 8 dígitos entre los 8 primeros caracteres y que la letra introducida es igual a la de la ecuación
				// Llamamos a los métodos privados de la clase soloNumeros() y letraDNI()
				if(soloNumeros(dni) == true ) {
					return true;
				}
				else {
					return false;
				}
	}
	private static boolean soloNumeros(String dni) {

		int i, j = 0;
		String numero = ""; /* Es el número que se comprueba uno a uno por si hay alguna letra entre los 8 primeros dígitos*/
		String miDNI = ""; // Guardamos en una cadena los números para después calcular la letra
		String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};

		for(i = 0; i < dni.length() - 1; i++) {
			numero = dni.substring(i, i+1);

			for(j = 0; j < unoNueve.length; j++) {
				if(numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if(miDNI.length() != 8) {
			return false;
		}
		else {
			return true;
		}
	}
}
