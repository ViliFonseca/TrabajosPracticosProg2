package sueldos;

public class Empleado {
private double salarioFijo;
private String nombre;
public double getSalarioFijo() {
	return salarioFijo;
}

public void setSalarioFijo(double salarioFijo) {
	this.salarioFijo = salarioFijo;
}

public Empleado(String nombre, double salarioFijo) {
	this.nombre = nombre;
	this.salarioFijo = salarioFijo;
}
public double calcularSalario() {
	return salarioFijo;
}

public String getNombre() {
	return nombre;
}
}
