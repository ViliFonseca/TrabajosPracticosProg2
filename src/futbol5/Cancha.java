package futbol5;

import java.time.LocalDate;

public class Cancha {
private LocalDate fecha;
private int idCancha;
private int totalPagado;
public Cancha(int idCancha, int totalPagado) {

	this.fecha = LocalDate.now();
	this.idCancha = idCancha;
	this.totalPagado = totalPagado;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public int getIdCancha() {
	return idCancha;
}
public void setIdCancha(int idCancha) {
	this.idCancha = idCancha;
}
public int getTotalPagado() {
	return totalPagado;
}
public void setTotalPagado(int totalPagado) {
	this.totalPagado = totalPagado;
}

@Override
public String toString() {
	return "Cancha" +this.getIdCancha()+"Total pagado: " +this.getTotalPagado()+"Fecha de alquiler"+ this.getFecha();
	
}



}
