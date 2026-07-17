package trabajoEspecial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Album extends ElementoFoto {
private String titulo;
private ArrayList<ElementoFoto> lista;
private LocalDate fecha;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public Album(String titulo, LocalDate fecha) {
	super();
	this.titulo = titulo;
	this.fecha = fecha;
	this.lista = new ArrayList<ElementoFoto>();
}	
      
@Override
public int getPeso() {
	int suma = 0;
	for(ElementoFoto lis : lista) {
		suma+= lis.getPeso();
	}
	return suma;
}
@Override
public int getCantidad() {
	int suma = 0;
	for(ElementoFoto lis : lista) {
		suma+= lis.getCantidad();
	}
	return suma;
}
public void addElemento(ElementoFoto a) {
	this.lista.add(a);
	Collections.sort(lista);
}
public ArrayList<String> getPersonas(){
	  ArrayList<String> retorno = new ArrayList<String>();
    for (ElementoFoto lis : lista) {
    	 ArrayList<String> listaPersona = lis.getPersonas();
    	 for(String persona : listaPersona) {
    		 if(!retorno.contains(persona))
    			 retorno.add(persona);    	 }
    }

      return retorno;
      }
@Override
public ElementoFoto copia(Condicion c) {
	Album copiaAlbum = null;
	if (c.cumple(this)) {
		copiaAlbum = new Album(this.titulo, this.fecha);
		for (ElementoFoto elemento : lista) {
			ElementoFoto copiaElemento = elemento.copia(c);
			if (copiaElemento != null) {
				copiaAlbum.addElemento(copiaElemento);
			}
		}
	}
	return copiaAlbum;
}
 
}
