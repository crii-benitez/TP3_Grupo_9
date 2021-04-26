package ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Archivo {

	private String ruta;
	private boolean append;
	private static BufferedReader bufferReader;
	private BufferedWriter bufferWriter;

	public Archivo() {
	}

	// método que consulta la existencia de un archivo.
	// INPUTS:
	// ruta(String)
	//
	// OUTPUT:
	// true/false

	public boolean existeArchivo(String ruta) {
		File archivo = new File(ruta);
		if (archivo.exists())
			return true;
		return false;
	}

	// método que escribe un archivo o lo actualiza dependiendo de sus parametros.
	// INPUTS:
	// ruta(String)
	// append(boolean)
	// frase(String)
	//

	public void escribeArchivo(String txtLinea) {
		FileWriter entrada;
		bufferWriter = null;
		try {
			entrada = new FileWriter(ruta, append);
			bufferWriter = new BufferedWriter(entrada);
			bufferWriter.write(txtLinea);
			bufferWriter.close();
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// método que lee un archivo.
	// INPUTS:
	// ruta(String)
	//
	public static List<String> leerArchivo(String ruta) {
		List<String> lista = new ArrayList<>();
		FileReader entrada;
		bufferReader = null;
		
		try {
			entrada = new FileReader(ruta);
			bufferReader = new BufferedReader(entrada);
			String txtItem = "";

			while (txtItem != null) {
				txtItem = bufferReader.readLine();
				lista.add(txtItem);
			}
			
			entrada.close();
			bufferReader.close();
			return lista;
		
		} catch (IOException e) {
			System.out.println("No se encontro el archivo en la ruta: " + ruta);
		}
		return null;
	}
}