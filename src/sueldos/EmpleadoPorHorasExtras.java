package sueldos;

public class EmpleadoPorHorasExtras extends Empleado {
private int horaTrabajada;
private int montoExtra; 
	public EmpleadoPorHorasExtras(String nombre, double salarioFijo,int horaTrabajada,int montoExtra) {
		super(nombre, salarioFijo);
		this.horaTrabajada= horaTrabajada;
	    this.montoExtra = montoExtra;
	}
	
	 public double calcularMonto() {
		 return this.montoExtra * this.horaTrabajada;
	 }
	public double calcularSalario() {
		return super.calcularSalario() + this.calcularMonto();
	}
	
	
}
