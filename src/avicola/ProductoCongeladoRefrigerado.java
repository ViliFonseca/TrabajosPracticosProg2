package avicola;

import java.time.LocalDate;

public class ProductoCongeladoRefrigerado extends Producto {
private int codigo;
private int temperaturaRecomendada;
public ProductoCongeladoRefrigerado(LocalDate fechaCaducidad, int numeroDeLote, LocalDate fechaEnvasado, String granjaOrigen,
		int codigo, int temperaturaRecomendada) {
	super(fechaCaducidad, numeroDeLote, fechaEnvasado, granjaOrigen);
	this.codigo = codigo;
	this.temperaturaRecomendada = temperaturaRecomendada;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getTemperaturaRecomendada() {
	return temperaturaRecomendada;
}
public void setTemperaturaRecomendada(int temperaturaRecomendada) {
	this.temperaturaRecomendada = temperaturaRecomendada;
}
public String getEtiqueta() {
	return super.getEtiqueta() + "Código del organismo de supervisión alimentaria : " + this.getCodigo() + "Temperatura Recomendada: " + this.getTemperaturaRecomendada();
}

}
