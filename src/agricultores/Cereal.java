package agricultores;

import java.util.ArrayList;

public class Cereal {
private ArrayList<String> mineralesNec;
private String nombre;
public ArrayList<String> getMineralesNec() {
	return mineralesNec;
}
public void setMineralesNec(ArrayList<String> mineralesNec) {
	this.mineralesNec = mineralesNec;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Cereal(String nombre) {
	this.nombre = nombre;
	this.mineralesNec = new ArrayList<>();
}
public boolean sePuedeSembrar(Lote lote) {
	ArrayList<String> mineralesLote = lote.getMinerales();
	if(mineralesLote.containsAll(mineralesNec))
		return true;
else 
	return false;
}
public void añadirMineral(String mineral) {
	mineralesNec.add(mineral);
}
@Override
public String toString() {
	return "Cereal [nombre=" + nombre + "]";
}

}
