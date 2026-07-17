package recuperatorio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Objeto extends ElementoColeccion{
private String marca;
private LocalDate fecha;
private int peso;
private double precio;
public Objeto(String nombre,String marca, LocalDate fecha, int peso, double precio) {
	super(nombre);
	this.marca = marca;
	this.fecha = fecha;
	this.peso = peso;
	this.precio = precio;
}
  


public String getMarca() {
	return marca;
}



public void setMarca(String marca) {
	this.marca = marca;
}



public LocalDate getFecha() {
	return fecha;
}



public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}



public int getPeso() {
	return peso;
}



public void setPeso(int peso) {
	this.peso = peso;
}



public double getPrecio() {
	return precio;
}



public void setPrecio(double precio) {
	this.precio = precio;
}



@Override
public boolean equals(Object o) {
	try { 
		Objeto o1 = (Objeto) o;
		return this.getNombre().equals(o1.getNombre()) && this.getMarca().equals(o1.getMarca()) && this.getPeso() == o1.getPeso() && this.getPrecio()==o1.getPrecio()
				&& this.getFecha().equals(o1.getFecha());	  
	
	}
	catch(Exception e) {
	 return false;
	}
}



@Override
public int getCantidad() {
	return 1;
}


public boolean tieneObjeto(Objeto a) {
	return this.equals(a);
}
@Override
public ArrayList<Objeto> buscar(Condicion c, Comparator com) {
	ArrayList<Objeto> retorno = new ArrayList<Objeto>();
	if (c.cumple(this))
		retorno.add(this);
	return retorno;
}

}
