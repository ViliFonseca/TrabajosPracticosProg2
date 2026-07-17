package canchas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Usuario {
private String nombre;
private String email;
private int cantidadreservas;
private boolean socio;
private LocalDate ultimareserva;
public String getNombre() {
	return nombre;
}
public String getEmail() {
	return email;
}
public int getCantidadreservas() {
	return cantidadreservas;
}
public boolean isSocio() {
	return socio;
}
public LocalDate getUltimareserva() {
	return ultimareserva;
}
public Usuario(String nombre, String email) {
	this.nombre = nombre;
	this.email = email;
}
public void incrementarReservas() {
	LocalDate ahora = LocalDate.now();
	if (ultimareserva != null && ChronoUnit.MONTHS.between(ultimareserva, ahora) > 2) {
         this.cantidadreservas = 0;
     }
     
     this.cantidadreservas++;
     this.ultimareserva = ahora;
     
     
     if (this.cantidadreservas >= 4) {
         this.socio = true;
     } else {
         this.socio = false;
     }
}
public double calcularPrecio(double precioBase) {
    if (this.socio) {
        return precioBase * 0.9; // Aplicar el 10% de descuento
    }
    return precioBase;
}
	




}
