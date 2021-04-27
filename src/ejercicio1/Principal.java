package ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import ejercicio1.Archivo;
import ejercicio1.Persona;

public class Principal {

	public static void main(String[] args) throws IOException {

		// Punto B

		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		ArrayList<String> listaArchivo = new ArrayList<String>();
		final String archResultado = "./archivos/Resultado.txt";
		final String archPersonas = "./archivos/Personas.txt";

		listaArchivo = Archivo.leerArchivo(archPersonas);
		Iterator<String> it = listaArchivo.iterator();

		while (it.hasNext()) {
			Persona persona = new Persona();

			String txt = it.next();
			String[] parts = txt.split("-");
			String valor = "";
			String valor1 = "";
			String valor2 = "";
			valor = parts[0];
			valor1 = parts[1];
			valor2 = parts[2];

			persona.setNombre(valor);
			persona.setApellido(valor1);
			persona.setDni(valor2);
			try {
				Validaciones.verificarDniInvalido(valor2);
				listaPersonas.add(persona);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("error en control de datos");
			}

		}

		// Punto C
		try {
			for (Persona personita : listaPersonas) {
				if (Archivo.existeArchivo(archResultado) == true) {
					Archivo.escribeArchivo(archResultado, true, personita.toString());
					Archivo.escribeArchivo(archResultado, true, "\n");
				} else {
					Archivo.escribeArchivo(archResultado, false, personita.toString());
					Archivo.escribeArchivo(archResultado, true, "\n");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al escribir archivo resultado.txt");
		}

	}

}
