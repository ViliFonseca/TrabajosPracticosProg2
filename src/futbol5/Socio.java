package futbol5;

import java.util.ArrayList;

public class Socio {
private String nombre;
private String apellido;
private int edad;
private ArrayList<Cancha> listaAlquiler;
private boolean tienePaga;
public Socio(String nombre, String apellido, int edad, boolean tienePaga) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.tienePaga = tienePaga;
	this.listaAlquiler = new ArrayList<>();
}
public String getNombre() {
	return nombre;
}

public ArrayList<Cancha> getListaAlquiler() {
	return listaAlquiler;
}
public String getApellido() {
	return apellido;
}
public int getEdad() {
	return edad;
}

public boolean isTienePaga() {
	return tienePaga;
}

public void alquilarCancha(Cancha a){
	if(this.tienePaga)
		listaAlquiler.add(a);
}
@Override
public String toString() {
	return this.apellido + this.nombre + this.edad+ this.getListaAlquiler();
	
}

}
