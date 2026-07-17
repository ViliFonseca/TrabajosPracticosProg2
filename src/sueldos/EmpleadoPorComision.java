package sueldos;

public class EmpleadoPorComision extends Empleado {
private double porcentajeVenta;
private double cantidadDeVenta;
	public EmpleadoPorComision(String nombre, double salarioFijo, double porcentajeVenta,double cantidadDeVenta) {
		super(nombre, salarioFijo);
		this.porcentajeVenta = porcentajeVenta;
		this.cantidadDeVenta = cantidadDeVenta;
	}
	
	public double calcularMonto() {
		return (this.porcentajeVenta * this.cantidadDeVenta);
	}
 public double calcularSalario() {
	 return super.calcularSalario() + this.calcularMonto();
 }
}
