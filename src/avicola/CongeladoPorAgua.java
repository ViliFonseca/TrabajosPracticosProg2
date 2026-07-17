package avicola;

import java.time.LocalDate;

public class CongeladoPorAgua extends ProductoCongeladoRefrigerado {
private double salinidadDelAgua;

public CongeladoPorAgua(LocalDate fechaCaducidad, int numeroDeLote, LocalDate fechaEnvasado, String granjaOrigen,
		int codigo, int temperaturaRecomendada, double salinidadDelAgua) {
	super(fechaCaducidad, numeroDeLote, fechaEnvasado, granjaOrigen, codigo, temperaturaRecomendada);
	this.salinidadDelAgua = salinidadDelAgua;
}


public String getEtiqueta() {
	return super.getEtiqueta() + "Salinidad del Agua" + this.getSalinidadDelAgua();
}


public double getSalinidadDelAgua() {
	return salinidadDelAgua;
}
}
