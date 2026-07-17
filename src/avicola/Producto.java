package avicola;

import java.time.LocalDate;

public class Producto {
	private LocalDate fechaEnvasado;
private LocalDate fechaCaducidad;
private int numeroDeLote;
private String granjaOrigen;
public Producto(LocalDate fechaCaducidad, int numeroDeLote, LocalDate fechaEnvasado,String granjaOrigen) {
	this.fechaCaducidad = fechaCaducidad;
	this.numeroDeLote = numeroDeLote;
	this.fechaEnvasado = fechaEnvasado;
	this.granjaOrigen = granjaOrigen;
}
public LocalDate getFechaCaducidad() {
	return fechaCaducidad;
}
public void setFechaCaducidad(LocalDate fechaCaducidad) {
	this.fechaCaducidad = fechaCaducidad;
}
public int getNumeroDeLote() {
	return numeroDeLote;
}
public void setNumeroDeLote(int numeroDeLote) {
	this.numeroDeLote = numeroDeLote;
}
public LocalDate getFechaEnvasado() {
	return fechaEnvasado;
}
public void setFechaEnvasado(LocalDate fechaEnvasado) {
	this.fechaEnvasado = fechaEnvasado;
}
public String getGranjaOrigen() {
	return granjaOrigen;
}
public void setGranjaOrigen(String granjaOrigen) {
	this.granjaOrigen = granjaOrigen;
}
public String getEtiqueta() {
	return "Fecha Envasado :" + this.getFechaEnvasado() + "Numero de lote :" + this.getNumeroDeLote() + "Fecha Caducidad :"+ this.getFechaCaducidad() + 
			"Granja Origen: " + this.getGranjaOrigen();
}
}
