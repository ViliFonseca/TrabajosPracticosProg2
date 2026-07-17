package coleccionables;

import java.util.ArrayList;

public abstract class ElementoFigura {
private String nombre;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public ElementoFigura(String nombre) {
	super();
	this.nombre = nombre;
}
public abstract double getPrecio();

public String toString(){
    return "Nombre: "+ this.nombre ;
}
public abstract ArrayList<Figura> buscarFigura(Condicion condicion);
}
