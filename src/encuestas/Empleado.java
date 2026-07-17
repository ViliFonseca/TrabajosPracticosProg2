package encuestas;

public class Empleado {
private String nombre; 
private String apellido;
private int encuestasRespondidas;
private int dni;
public int getDni() {
	return dni;
}
public Empleado(String nombre, String apellido, int dni) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
public int getEncuestasRespondidas() {
	return encuestasRespondidas;
}
public void aumentarEncuestasrespondidas() {
	this.encuestasRespondidas++;
}
}
