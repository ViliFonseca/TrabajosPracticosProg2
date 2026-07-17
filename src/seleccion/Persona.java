package seleccion;

import java.time.LocalDate;

public class Persona {
private String nombre;
private String apellido;
private int numeroPasaporte;
private LocalDate fechaNacimiento;
private String estado;
public Persona(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, String estado) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.numeroPasaporte = numeroPasaporte;
	this.fechaNacimiento = fechaNacimiento;
	this.estado = estado;
}




public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getNumeroPasaporte() {
	return numeroPasaporte;
}
public void setNumeroPasaporte(int numeroPasaporte) {
	this.numeroPasaporte = numeroPasaporte;
}
public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}


public boolean estaHabilitado() {
	if(this.getEstado().equalsIgnoreCase("viajando")) {
		return false;
	}else
		return true;
}


public boolean equals(Object otro) {
	try {
		Persona otroJ = (Persona)otro;
		return this.getNumeroPasaporte() == otroJ.getNumeroPasaporte()
				&& this.getNombre().equals(otroJ.getNombre()) && this.getApellido().equals(otroJ.getApellido());
	}
	catch (Exception e) {
		return false;
	}
}
}
