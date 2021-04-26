package ejercicio1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import ejercicio1.Persona;

public class Principal {

	public static void main(String[] args) throws IOException {
		// ejercicio B hecho por pavi
		// B. Leer el archivo llamado Personas.txt, que está compuesto por Nombre
		// – Apellido – Dni y pasar los datos que se encuentran en el archivo a una
		// lista que no acepte datos duplicados, que permita ordenar los datos
		// según el Apellido desde la A – Z y además no se agregará a la lista Dni
		// que no cumplan el requisito de solo contener números (utilizar la
		// función verificarDniInvalido para validar que el dni sea correcto)

		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		List<String> listaArchivo = new ArrayList<>();
		listaArchivo = Archivo.leerArchivo("./archivos/Personas.txt");
		Iterator<String> it = listaArchivo.iterator();
		while (it.hasNext()) {
			Persona persona = new Persona();
			
			String txt = it.next();
			String[] parts = txt.split("-");
			persona.setNombre(parts[0]);
			persona.setApellido(parts[1]);
			persona.setDni(parts[2]); 
			listaPersonas.add(persona);
		}

		// punto B
		// FileReader entrada;
		// ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		// try {
		// //entrada = new FileReader("./archivos/Personas.txt");
		// //BufferedReader miBuffer = new BufferedReader(entrada);
		//
		// String linea = "";
		// while (linea != null) {
		// linea = miBuffer.readLine();
		// /*lo agrego a la lista tipo persona*/
		// //String separador = Pattern.quote("-");
		// String[] parts = new String[50];
		// parts= linea.split("-");
		// // System.out.println(parts[0]+parts[1]+parts[2]);
		// if(Validaciones.verificarDniInvalido(parts[2]))
		// {
		//// int dni_ =Integer.parseInt(parts[2]);
		//// }
		//// if (String.valueOf(dni_).length()==7 || String.valueOf(dni_).length()==8)
		//// {
		//
		// Persona p1 = new Persona();
		// p1.setNombre(parts[0].toString());
		// p1.setApellido(parts[1].toString());
		// p1.setDni(Integer.parseInt(parts[2].toString()));
		// listaPersonas.add(p1);
		// }
		// //System.out.println(linea);
		// }
		//
		// // entrada.close();
		//
		//
		//
		//
		// }
		// catch (IOException e) {
		// System.out.println(e.getMessage() + "Leo");
		// }
		// catch(ArrayIndexOutOfBoundsException e)
		// {
		// System.out.println("Se está tratando de acceder a una posición inválida");
		// }
		// catch(NumberFormatException e)
		// {
		// System.out.println("Formato Dni incorrecto");
		// }
		// finally
		// {
		// System.out.println("Listado de personas en el archivo: ");
		//
		// Iterator<Persona> it = listaPersonas.iterator();
		// while (it.hasNext()) {
		// Persona persona = it.next();
		//// it.remove();
		// System.out.println(persona.toString());
		// }
		// }
		// miBuffer.close();
		//
	}

}
