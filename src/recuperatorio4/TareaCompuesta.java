package recuperatorio4;

import java.util.ArrayList;

public class TareaCompuesta extends ElementoTarea{
protected ArrayList<ElementoTarea> tareas;
private static int extra = 10;

public TareaCompuesta() {
	super();
	this.tareas = new ArrayList<ElementoTarea>();
}

@Override
public double getCosto() {
	int size = tareas.size();
	return tareas.get(size-1).getCosto();
	
}

@Override
public int getTiempo() {
	int suma=0;
	for(ElementoTarea elem :tareas) {
		int aux = elem.getTiempo();
		if(aux>suma) {
			suma = aux;
		}
	}
	return suma;
}

@Override
public ArrayList<String> getAcciones() {
	ArrayList<String> retorno = new ArrayList<String>();
	for(ElementoTarea elem: tareas) {
		retorno.addAll(elem.getAcciones());   
	}
	return retorno;
}

@Override
public int cantidadTareas() {
	int suma =0;
	for(ElementoTarea tar: tareas) {
		suma+= tar.cantidadTareas();
	}
	return suma;
}

@Override
public ElementoTarea copia(Condicion c) {
      TareaCompuesta copia = (TareaCompuesta) crearCascaron();
      boolean agrego= false;
      for(ElementoTarea tarea : tareas) {
    	  ElementoTarea hijo = tarea.copia(c);
    	  if(hijo!=null) {
    		  copia.addElemento(hijo);
    		  agrego= true;
    	  }
    	  
    	  
      }
      if(agrego) {
    	  return copia;
      }
      return null;
}

private void addElemento(ElementoTarea hijo) {
	tareas.add(hijo);
}

@Override
public ElementoTarea crearCascaron() {
	return new TareaCompuesta();
}

}
