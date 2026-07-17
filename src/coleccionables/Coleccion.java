package coleccionables;

import java.util.ArrayList;
public class Coleccion extends ElementoFigura{
	public Coleccion(String nombre,double descuento) {
		super(nombre);
		this.elementos = new ArrayList<>();
		this.descuento = descuento;
	}
	private ArrayList<ElementoFigura> elementos;
    private double descuento;
	@Override
	public double getPrecio() {
	  double total =0;
	  for(ElementoFigura elemento : elementos) {
		  total += elemento.getPrecio();
	  }
		  return total - total *descuento/100;
	}
public void añadirElemento(ElementoFigura elem) {
	if(!elementos.contains(elem))
      elementos.add(elem);
}

public boolean tieneElemento(ElementoFigura elem){
    return elementos.contains(elem);
}

public void removeElemento(ElementoFigura aBorrar){
    this.elementos.remove(aBorrar);  //NO OLVIDAR EL EQUALS
}


public ArrayList<Figura> buscarFigura(Condicion condicion){
    ArrayList<Figura> retorno = new ArrayList<>();
    for (ElementoFigura elem:elementos){
        retorno.addAll(elem.buscarFigura(condicion));
    }

    return retorno;
}


}
