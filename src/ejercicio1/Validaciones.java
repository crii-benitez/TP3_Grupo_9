package ejercicio1;

public class Validaciones {
	public static boolean verificarDniInvalido(String dni) throws DniInvalidoException, NumberFormatException {
		try {
			int dni_ = Integer.parseInt(dni);
			if (String.valueOf(dni_).length() == 7 || String.valueOf(dni_).length() == 8)
				return true;
		} catch (Exception e) {
			throw new DniInvalidoException();
		} 
	return false;
	}
}
