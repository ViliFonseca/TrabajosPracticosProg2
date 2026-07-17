package facturacionEmpleados;

public class EmpleadoPorcentaje extends Empleado{
private int cantidadVentas;
private double porcentaje;
public EmpleadoPorcentaje(String nombre, String apellido, int dni, double sueldo, int cantidadVentas,
		double porcentaje) {
	super(nombre, apellido, dni, sueldo);
	this.cantidadVentas = cantidadVentas;
	this.porcentaje = porcentaje;
}
public double getSueldo() {
	return super.getSueldo() + this.calcularExtra();
}
public double calcularExtra() {
	return (this.porcentaje/100) * this.cantidadVentas;
}
}
