package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

import ejercicio1.Persona;


public class principal {

	public static void main(String[] args) {
		//punto B
		FileReader entrada;
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		try {
			entrada = new FileReader("./archivos/Personas.txt");
			BufferedReader miBuffer = new BufferedReader(entrada);

		   String linea = "";
			while (linea != null) {
				linea = miBuffer.readLine();
				/*lo agrego a la lista tipo persona*/
				//String separador = Pattern.quote("-");
				String[] parts = new String[50];
					parts=	linea.split("-");
				//System.out.println(parts[0]+parts[1]+parts[2]);
				int dni_ =Integer.parseInt(parts[2]);
				if (String.valueOf(dni_).length()==7 || String.valueOf(dni_).length()==8)
				{
					
					Persona p1 = new Persona();
					p1.setNombre(parts[0].toString());
					p1.setApellido(parts[1].toString());
					p1.setDni(Integer.parseInt(parts[2].toString()));
					listaPersonas.add(p1);
				}
				//System.out.println(linea);
			}
			miBuffer.close();
			entrada.close();
			

			

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Se está tratando de acceder a una posición inválida");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Formato Dni incorrecto");
		}
		finally
		{
			System.out.println("Listado de personas en el archivo: ");

			ListIterator<Persona> it = listaPersonas.listIterator();
			while (it.hasNext()) {
				Persona persona = it.next();
				it.remove();
				System.out.println(persona.toString());
			}
		}

		
	}
	
}
