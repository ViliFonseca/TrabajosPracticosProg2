package seleccion;

import java.time.LocalDate;

public class Entrenador extends Persona {
private String federacion;
	public Entrenador(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, String estado, String federacion) {
		super(nombre, apellido, numeroPasaporte, fechaNacimiento, estado);	
		this.federacion = federacion;
	}
	public String getFederacion() {
		return federacion;
	}
	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}

}	
