package parcialNoticias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Seccion extends ElementoNoticia implements Comparable<ElementoNoticia> {
public Seccion(String categoria,Comparator comparador) {
		super(categoria);
		 this.elems = new ArrayList<ElementoNoticia>();
		 this.comparador = comparador;
				 }

private ArrayList<ElementoNoticia> elems;
private Comparator<ElementoNoticia> comparador;
@Override
public ElementoNoticia copia(Condicion c) {
	boolean agrego=false;
	Seccion seccion = new Seccion(this.getCategoria(), comparador);
	for(ElementoNoticia elem : elems) {
		ElementoNoticia hijo = elem.copia(c);
		if(hijo != null) {
			seccion.addElemento(hijo);
			agrego= true;
		}
	}if(agrego) {
		return seccion;
	}else return null;
}

private void addElemento(ElementoNoticia hijo) {
	elems.add(hijo);
	elems.sort(comparador);
	
}
@Override
public int compareTo(ElementoNoticia o) {
	return this.getCategoria().compareTo(o.getCategoria());
}
}

