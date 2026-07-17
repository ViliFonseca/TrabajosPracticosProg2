package facturacionEmpleados;

public class EmpleadoBono extends Empleado{
private int cantidadVentas;
private int ventasMinimas;
private double bono;

public EmpleadoBono(String nombre, String apellido, int dni, double sueldo, int cantidadVentas, int ventasMinimas, double bono) {
	super(nombre, apellido, dni, sueldo);
	this.cantidadVentas = cantidadVentas;
	this.ventasMinimas = ventasMinimas;
	this.bono = bono;
}
public int getCantidadVentas() {
	return cantidadVentas;
}
public void setCantidadVentas(int cantidadVentas) {
	this.cantidadVentas = cantidadVentas;
}
public int getVentasMinimas() {
	return ventasMinimas;
}
public void setVentasMinimas(int ventasMinimas) {
	this.ventasMinimas = ventasMinimas;
}

public double getSueldo() {
	if(this.getCantidadVentas() >= this.ventasMinimas)
		return super.getSueldo() + bono;
	else return super.getSueldo();
}


}
