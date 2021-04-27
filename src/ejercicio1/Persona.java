package ejercicio1;
import ejercicio1.Validaciones;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellido;
	private String dni;

	@Override
	public int compareTo(Persona arg0) {
		int dniThis = Integer.parseInt(this.dni);
		int dniArg0 = Integer.parseInt(arg0.dni);
		if (dniThis == dniArg0)
			return 0;
		else if (dniThis < dniArg0)
			return 1;
		else
			return -1;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona() {
	}

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
			if (Validaciones.verificarDniInvalido(dni))
				this.dni = dni;
		} catch (DniInvalidoException e) {
			e.getMessage();
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
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
