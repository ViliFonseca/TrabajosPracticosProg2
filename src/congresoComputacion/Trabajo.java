package congresoComputacion;

import java.util.ArrayList;

public class Trabajo {
private ArrayList<String> palabrasClave;
private String categoria;
public ArrayList<String> getPalabrasClave() {
	return palabrasClave;
}
public void añadirPalabraClave(String palabra){
	palabrasClave.add(palabra);
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}

	
}
