package ejercicio1;

import java.io.IOException;

public class DniInvalidoException extends IOException {

	public DniInvalidoException() {
	}

	@Override
	public String getMessage() {
		return "El formato del DNI es invalido";
	}

}
