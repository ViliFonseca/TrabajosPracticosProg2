package fabricaDeMuebles;

public class Producto {
	private double peso;
	private double costo;
	private double precio;
	private String color;
	private String tipoMadera;
	
	
	public Producto(double peso, double costo, double porcentaje, String color, String tipoMadera) {
		super();
		this.peso = peso;
		this.costo = costo;
		this.precio = calcularPrecioVenta(porcentaje);
		this.color = color;
		this.tipoMadera = tipoMadera;
	}
	public double getPeso() {
		return peso;
	}
	public double getCosto() {
		return costo;
	}
	public double getPrecio() {
		return precio;
	}
	public String getColor() {
		return color;
	}
	public String getTipoMadera() {
		return tipoMadera;
	}
	public String mostrarInformacion() {
     return this.peso + this.costo + this.precio + this.color+ this.tipoMadera;		
	}
	public double calcularPrecioVenta(double porcentaje) {
		double porciento = (this.costo * porcentaje)/100;
		return this.costo + porciento;
		
	}
}
