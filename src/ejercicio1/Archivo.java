package ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Archivo {

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

	public Archivo() {
		
	}

	public void escribeFraseArchivo(String ruta, boolean append, String frase) {
		FileWriter entrada;
		try {
			entrada = new FileWriter(ruta, append);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.close();
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// método que lee un archivo.
	// INPUTS:
	// ruta(String)
	//
	public BufferedReader leeArchivo(String ruta) throws IOException {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			String linea = "";
			while (linea != null) {
		//		System.out.println(linea);
				linea = miBuffer.readLine();
			}
			
			return miBuffer;
			
			
		} catch (IOException e) {
			System.out.println("No se encontro el archivo en la ruta: " + ruta);
		}
		finally{
			//entrada.close();
		}
		return null;
	}
}