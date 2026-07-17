package recuperatorio2;

import java.util.ArrayList;

public class Curso extends ElementoCurso {
private double precio;
public Curso(String nombre, double precio,
		double horasCat) {
	super(nombre);
	this.precio = precio;
	this.docentes = new ArrayList<String>();
	this.palabrasClave = new ArrayList<String>();
	this.horasCat = horasCat;
}
private ArrayList<String> docentes;
private ArrayList<String> palabrasClave;
private double horasCat;
@Override
public double getPrecio() {
	return precio;
}
@Override
public int cantidadCursos() {
	return 1;
}
@Override
public ArrayList<String> getPalabrasclave() {
	return new ArrayList<String>(palabrasClave);
}
@Override
public double cantidadHoras() {
	// TODO Auto-generated method stub
	return horasCat;
}

public void addPalabra(String palabra) {
	if(!palabrasClave.contains(palabra))
		palabrasClave.add(palabra);
}
@Override
public Curso cursoMasCaro() {
	return this;
}
@Override
public ArrayList<Curso> Buscar(Condicion c) {
	ArrayList<Curso> retorno= new ArrayList<Curso>();
	if(c.cumple(this)) {
		retorno.add(this);
	}
	return retorno;
}
@Override
public String toString() {
	return this.getNombre();
	
}
}
