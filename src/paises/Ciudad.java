package paises;

public class Ciudad {
private String nombre;
private int gasto;
private Impuesto[] impuestos;
private int habitantes;
public String getNombre() {
	return nombre;
}
public int getGasto() {
	return gasto;
}

public int getHabitantes() {
	return habitantes;
}
public void setHabitantes(int habitantes) {
	this.habitantes = habitantes;
}
public Ciudad(String nombre, int habitantes, int gasto	, Impuesto[] impuestos) {
	super();
	this.nombre = nombre;
	this.gasto = gasto;
	this.impuestos = impuestos;
	this.habitantes = habitantes;
}

public double calcularRecaudado() {
	int suma=0;
	for(int i = 0; i < impuestos.length; i++) {
		suma+= impuestos[i].getValor()*habitantes;
	    }
return suma;
}
public boolean hayDeficit() {
	return calcularRecaudado() < gasto;
}
}
