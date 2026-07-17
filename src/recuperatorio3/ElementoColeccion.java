package recuperatorio3;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoColeccion {
private String nombre;
public abstract double getPrecio();
public abstract int getPeso();
public abstract int getCantidad();
public abstract ArrayList<Objeto> buscar(Condicion c, Comparator com);
public abstract boolean tieneObjeto(Objeto a);
public ElementoColeccion(String nombre) {
	super();
	this.nombre = nombre;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
