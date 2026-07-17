package agricultores;

import java.util.ArrayList;

public class Lote {
private ArrayList<String> minerales;
private int identificador;
private boolean esEspecial;
private int hectareas;
public int getHectareas() {
	return hectareas;
}
public void setHectareas(int hectareas) {
	this.hectareas = hectareas;
}
public ArrayList<String> getMinerales() {
	return minerales;
}
public void setMinerales(ArrayList<String> minerales) {
	this.minerales = minerales;
}
public int getIdentificador() {
	return identificador;
}
public void setIdentificador(int identificador) {
	this.identificador = identificador;
}
public boolean isEsEspecial() {
	return esEspecial;
}
public void setEsEspecial(boolean esEspecial) {
	this.esEspecial = esEspecial;
}
public Lote(int identificador, int hectareas) {
	this.identificador = identificador;
	this.hectareas = hectareas;
	this.minerales = new ArrayList<>();
}
public boolean contieneMinerales(Cereal cereal) {
	ArrayList<String> mineralesCer = cereal.getMineralesNec();
	int cantidadMiner = 0;
	for(String mineral : minerales) {
		for(String mineralCer : mineralesCer) {
	  if(mineralCer.equals(mineral))
		cantidadMiner++;
		}
		}
	return cantidadMiner >= cereal.getMineralesNec().size();
	}
public void añadirMineral(String mineral) {
	minerales.add(mineral);
}
@Override
public String toString() {
	return "Lote [Numero=" + identificador + "Hectareas "+ this.getHectareas()+ "]";
}
}
