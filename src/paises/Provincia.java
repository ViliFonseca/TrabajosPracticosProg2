package paises;

public class Provincia {
private String nombre;
private Ciudad[] ciudades;
public Provincia(String nombre, Ciudad[] ciudades) {
	super();
	this.nombre = nombre;
	this.ciudades = ciudades;
}
public String getNombre() {
	return nombre;
}
public boolean hayDeficit() {
	int suma=0;
	for(int i=0;i < ciudades.length;i++ ) {
	if(ciudades[i].hayDeficit()){
		suma++;
	}
	}
	return suma > (ciudades.length/2);
}
public void queCiudades() {
	String suma = "";
	for(int i=0;i < ciudades.length;i++ ) {
	if(ciudades[i].hayDeficit()){
		suma += " " + ciudades[i].getNombre();
	}
	}
	System.out.println(suma);
}
}
