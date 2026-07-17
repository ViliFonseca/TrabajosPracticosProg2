package congresoComputacion;

import java.util.ArrayList;

public class Evaluador {
private ArrayList<String> conocimientos;
private String nombre;
private int trabajosAsig;
private String tipo;
private ArrayList<Trabajo> listaTrabajos;

public Evaluador(String nombre, int trabajosAsig) {
	this.nombre = nombre;
	this.trabajosAsig = trabajosAsig;
	this.conocimientos = new ArrayList<>();
}
public ArrayList<String> getConocimientos() {
	return conocimientos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getTrabajosAsig() {
	return trabajosAsig;
}
public String getTipo() {
	return tipo;
}

public boolean esAptoParaTrabajo(Trabajo trabajo) {
	   int contador=0;
       ArrayList<String> tbjPalabras = trabajo.getPalabrasClave();
       for(String tbjPalabra : tbjPalabras) {
    	for(String conocimiento : conocimientos) {
    		if(conocimiento.equals(tbjPalabra))
    			contador++;
    	}   
       }
     

return contador >=1;
}

public void agregarTrabajo(Trabajo trabajo){
		listaTrabajos.add(trabajo);
		trabajosAsig++;
	}
}


