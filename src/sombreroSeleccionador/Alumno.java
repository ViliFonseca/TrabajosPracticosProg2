package sombreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
private String nombre;
private ArrayList<String> cualidades;
private ArrayList<Alumno> familiares;
private boolean tieneCasa;
private String nombreCasa;
public Alumno(String nombre) {
    this.nombre = nombre;
    this.cualidades = new ArrayList<>();
    this.familiares =  new ArrayList<>();
    this.tieneCasa = false;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public boolean tieneCasa() {
	return tieneCasa;
}

public boolean isTieneCasa() {
	return tieneCasa;
}


public String getNombreCasa() {
	return nombreCasa;
}

public void setNombreCasa(String nombreCasa) {
	this.nombreCasa = nombreCasa;
}

public void setTieneCasa() {
	this.tieneCasa = true;
}

public void añadirCualidades(String cualidad) {
	cualidades.add(cualidad);
}
public ArrayList<Alumno> getFamiliares(){
return familiares;
}

public void añadirFamiliar(Alumno familiar) {
	familiares.add(familiar);
	}

public ArrayList<String> getCualidades() {
	return cualidades;
}
public String toString() {
	return this.getNombre();
}
}