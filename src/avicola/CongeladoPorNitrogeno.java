package avicola;

import java.time.LocalDate;

public class CongeladoPorNitrogeno extends ProductoCongeladoRefrigerado {
private String metodoCongelacion;
private int tiempoExposicionNitrogeno; // en segundos
public CongeladoPorNitrogeno(LocalDate fechaCaducidad, int numeroDeLote, LocalDate fechaEnvasado, String granjaOrigen,
		int codigo, int temperaturaRecomendada, String metodoCongelacion, int tiempoExposicionNitrogeno) {
	super(fechaCaducidad, numeroDeLote, fechaEnvasado, granjaOrigen, codigo, temperaturaRecomendada);
	this.metodoCongelacion = metodoCongelacion;
	this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
}
public String getMetodoCongelacion() {
    return metodoCongelacion;
}

public int getTiempoExposicionNitrogeno() {
    return tiempoExposicionNitrogeno;
}


public String getEtiqueta() {
    return super.getEtiqueta() + ", Método de Congelación: " + metodoCongelacion +
           ", Tiempo de Exposición al Nitrógeno: " + tiempoExposicionNitrogeno + " segundos";
}

}
