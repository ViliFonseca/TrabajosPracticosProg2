package seleccion;

import java.time.LocalDate;

public class Masasjista extends Persona {
private int añosExp;
private String Titulo;
public Masasjista(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, String estado,
		int añosExp, String titulo) {
	super(nombre, apellido, numeroPasaporte, fechaNacimiento, estado);
	this.añosExp = añosExp;
	Titulo = titulo;
}
public int getAñosExp() {
	return añosExp;
}
public void setAñosExp(int añosExp) {
	this.añosExp = añosExp;
}
public String getTitulo() {
	return Titulo;
}
public void setTitulo(String titulo) {
	Titulo = titulo;
}



}
