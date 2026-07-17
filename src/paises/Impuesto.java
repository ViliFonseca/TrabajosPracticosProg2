package paises;

public class Impuesto {

	private String nombre;
	private double valor;

	public String getNombre() {
		return nombre;
	}

	public double getValor() {
		return valor;
	}

	public Impuesto(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

}
