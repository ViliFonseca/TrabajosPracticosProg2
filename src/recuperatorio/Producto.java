package recuperatorio;

import java.util.ArrayList;

public class Producto extends ElementoProducto {
private ArrayList<String> categorias;	
private int peso;
private double precio;
@Override
public double getPrecio() {
	return this.precio;
}
@Override
public int getCantidad() {
	return 1;
}
@Override
public int getPeso() {
	return this.peso;
}
public void añadirCategoria(String s) {
	if(!this.categorias.contains(s))
      categorias.add(s);
}
public Producto( int peso, double precio) {
	super();
	this.categorias = new ArrayList<String>();
	this.peso = peso;
	this.precio = precio;
}

}
