package ejercicio1;


public class Persona  implements Comparable<Persona> {
	String Nombre;
	String Apellido;
	int Dni;
	@Override
	public int compareTo(Persona arg0) {
		//ORDENAMIENTO por DNI de > a <
		if(arg0.Dni == this.Dni)
			return 0;
		
		if (Dni<this.Dni)
		{
			return 1;
		}		
		return -1;
	}

	
	//Getters and Setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Persona() {}
	public Persona(String nombre, String apellido, int dni) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Dni = dni;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Dni=" + Dni + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellido == null) ? 0 : Apellido.hashCode());
		result = prime * result + Dni;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
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
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
		if (Dni != other.Dni)
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}
	

}
