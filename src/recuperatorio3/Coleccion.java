package recuperatorio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import recuperatorio4.ElementoTarea;

public class Coleccion extends ElementoColeccion{
public Coleccion(String nombre) {
		super(nombre);
		this.elems = new ArrayList<ElementoColeccion>();
	}
private ArrayList<ElementoColeccion> elems;
private static double descuento = 0.1;

public void addElemento(ElementoColeccion elem) {
	elems.add(elem);
}
public ArrayList<ElementoColeccion> getElementos(){
	return new ArrayList<ElementoColeccion>(elems);
}
@Override
public double getPrecio() {
	int size = elems.size();
	return elems.get(0).getPrecio();
	
}

@Override
public int getPeso() {
	int suma = 0;
	for(ElementoColeccion elem: elems)
		suma+= elem.getPeso();
	return suma;
}

@Override
public int getCantidad() {
	int suma = 0;
	for(ElementoColeccion elem : elems) {
		suma+= elem.getCantidad();
	}
	return suma;
}
public boolean tieneObjeto(Objeto a) {
for(ElementoColeccion elem:elems) {
    if(elem.tieneObjeto(a)) { 
    	return true;}
   }
return false;

	}
@Override
public ArrayList<Objeto> buscar(Condicion c, Comparator com) {
	ArrayList<Objeto> retorno = new ArrayList<Objeto>();
	for(ElementoColeccion elem: elems) {
		retorno.addAll(elem.buscar(c, com));
	}
    Collections.sort(retorno,com);
	return retorno;
}
}
