package coleccionables;

import java.util.ArrayList;

public class Figura extends ElementoFigura{
private String nombre;
private String album;
private int numero;
private double precio;
@Override
public double getPrecio() {
	// TODO Auto-generated method stub
	return this.precio;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getAlbum() {
	return album;
}
public void setAlbum(String album) {
	this.album = album;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public Figura(String nombre, String album, int numero, double precio) {
	super(nombre);
	this.album = album;
	this.numero = numero;
	this.precio = precio;
}
public ArrayList<Figura> buscarFigura(Condicion cond){
	ArrayList<Figura> retorno = new ArrayList<>();
	
	   if(cond.cumple(this)) {
		   retorno.add(this);}
	return retorno;
}

}
