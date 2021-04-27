package ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import ejercicio1.Archivo;
import ejercicio1.Persona;

public class Principal {

	public static void main(String[] args) throws IOException {

		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		ArrayList<String> listaArchivo = new ArrayList<String>();

		listaArchivo = Archivo.leerArchivo("./archivos/Personas.txt");
		Iterator<String> it = listaArchivo.iterator();
		
		while(it.hasNext()){
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
				
				if (Archivo.existeArchivo("./archivos/Resultado.txt") == false) {
					Archivo.escribeArchivo("./archivos/Resultado.txt", true, valor + " " + valor1 + " " + valor2 + "\n");
				} else {
					Archivo.escribeArchivo("./archivos/Resultado.txt", false, valor + " " + valor1 + " " + valor2 + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
	}

}
