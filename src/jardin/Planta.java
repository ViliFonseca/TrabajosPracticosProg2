package jardin;

import java.time.LocalDate;

public class Planta {
private String nombreCientifico;
private String nombreComun;
private String pais;
private LocalDate fechaDeCompra;
private int identificador;
private static int cuentaPlanta = 0;
public String getNombreCientifico() {
	return nombreCientifico;
}
public void setNombreCientifico(String nombreCientifico) {
	this.nombreCientifico = nombreCientifico;
}
public String getNombreComun() {
	return nombreComun;
}
public void setNombreComun(String nombreComun) {
	this.nombreComun = nombreComun;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public LocalDate getFechaDeCompra() {
	return fechaDeCompra;
}
public void setFechaDeCompra(LocalDate fechaDeCompra) {
	this.fechaDeCompra = fechaDeCompra;
}
public int getIdentificador() {
	return identificador;
}

public Planta(String nombreCientifico, String nombreComun, String pais, LocalDate fechaDeCompra) {
	super();
	this.nombreCientifico = nombreCientifico;
	this.nombreComun = nombreComun;
	this.pais = pais;
	this.fechaDeCompra = fechaDeCompra;
	this.identificador = Planta.cuentaPlanta;
     cuentaPlanta++;
}

}
