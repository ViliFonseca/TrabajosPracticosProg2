package juegoPersonaje;
public class Personaje {
 private String nombre;
 private Cualidad cualidades;
 
 public Personaje(String nombre, Cualidad cualidad) {
	 this.nombre = nombre;
	 this.cualidades = cualidad;
 }
 public int getCualidades(String cualidad) {
	 return this.cualidades.getNivelCualidad(cualidad);
	 
 }
public String getNombre() {
	return nombre;
}
public String getCualidadAleatoria() {
    return cualidades.getCualidadAleatoria();
}
}