package recuperatorio2;

import java.util.ArrayList;


public class Especializacion extends ElementoCurso {

public Especializacion(String nombre, double porcentaje) {
		super(nombre);
		this.elementos = new ArrayList<ElementoCurso>();
		this.porcentaje = porcentaje;
	}
private ArrayList<ElementoCurso> elementos;
private static double limite = 50;
private double porcentaje;
@Override
public double getPrecio() {
	double suma = 0;
	for(ElementoCurso elem : elementos) 
		suma+= elem.getPrecio();
	double descuento = porcentaje * cantidadCursos();
    if(descuento < limite) {
	descuento = limite;
    }
    	return suma-(suma*descuento);
}
@Override
public int cantidadCursos() {
	int suma = 0;
	for(ElementoCurso elem : elementos) {
		suma += elem.cantidadCursos();
	}
	return suma;
}
@Override
public ArrayList<String> getPalabrasclave() {
	 ArrayList<String> retorno = new ArrayList<String>();
      for(ElementoCurso elem : elementos) {
    	  ArrayList<String> aux=  new ArrayList<String>(elem.getPalabrasclave());
    	 for(String palabra : aux)
    	  if(!retorno.contains(palabra)) {
    		  retorno.add(palabra);
    	  }
      }     
	 return retorno;
}
@Override
public double cantidadHoras() {
	double suma=0;	
	for(ElementoCurso elem:elementos )
		suma+=elem.cantidadHoras();	
		return suma;
}
public void añadirElemento(ElementoCurso elem) {
		elementos.add(elem);
}
public Curso cursoMasCaro() {
	double valorAux = -1;
    Curso cursoMasCaro = null;
	for(ElementoCurso cur : elementos) {
	  Curso cursoMasCaroAux = cur.cursoMasCaro();
      double temp = cursoMasCaroAux.getPrecio();
	 if (cursoMasCaro == null || temp > valorAux) {
		 valorAux = temp;
		 cursoMasCaro = cursoMasCaroAux;
	 }
	}
	return cursoMasCaro;
}
@Override
public ArrayList<Curso> Buscar(Condicion c) {
	ArrayList<Curso> retorno= new ArrayList<Curso>();
	for(ElementoCurso elem : elementos) {
		retorno.addAll(elem.Buscar(c));
	}
	return retorno;
}

}
