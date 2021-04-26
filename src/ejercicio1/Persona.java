package ejercicio1;
import javax.swing.plaf.synth.SynthSeparatorUI;

import ejercicio1.Validaciones;


public class Persona  implements Comparable<Persona> {
	private String nombre;
	private String apellido;
	private String dni;
	@Override
	public int compareTo(Persona arg0) {
		//ORDENAMIENTO por DNI de > a <
//		if(arg0.getDni() == this.dni)
//			return 0;
//		
//		if (arg0.getDni()<this.dni)
//		{
//			return 1;
//		}		
		return -1;
	}

	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona() {}
	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public void setDni(String dni) {
		try {
			if(Validaciones.verificarDniInvalido(dni))
				this.dni = dni;
		} catch (DniInvalidoException e) {
			//e.printStackTrace();
			e.getMessage();
		}
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
//		result = prime * result + dni;
//		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni != other.dni)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	

}
