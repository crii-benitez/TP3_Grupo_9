package ejercicio1;
import ejercicio1.Validaciones;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellido;
	private String dni;

	@Override
	public int compareTo(Persona arg0) {
		return this.apellido.compareTo(arg0.apellido);
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

	public void setDni(String dni) throws DniInvalidoException {
		if (Validaciones.verificarDniInvalido(dni))
			this.dni = dni;
		else
			throw new DniInvalidoException();
	}
	@Override
	public String toString() {
		return nombre + "-" + apellido + "-" + dni;
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
