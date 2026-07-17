package seleccion;

import java.time.LocalDate;

public class Jugador extends Persona {
private String posicion;
private int goles;
private String manoHabil;

public Jugador(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, String estado,
		String posicion, int goles, String manoHabil) {
	super(nombre, apellido, numeroPasaporte, fechaNacimiento, estado);
	this.posicion = posicion;
	this.goles = goles;
	this.manoHabil = manoHabil;
}

public String getPosicion() {
	return posicion;
}

public void setPosicion(String posicion) {
	this.posicion = posicion;
}

public int getGoles() {
	return goles;
}

public void setGoles(int goles) {
	this.goles = goles;
}

public String getManoHabil() {
	return manoHabil;
}

public void setManoHabil(String manoHabil) {
	this.manoHabil = manoHabil;
}

}
