package farmacia;

import java.util.ArrayList;

public class Medicamento {
	
	private String nombre;
	private String lab;
	private double precio;
	private ArrayList<String> sintomas;
	private String drogaPrincipal;
	
	public Medicamento(String nombre, String lab, double precio, String droga) {
		super();
		this.nombre = nombre;
		this.lab = lab;
		this.precio = precio;
		this.sintomas = new ArrayList<>();
		this.drogaPrincipal = droga;
	}
	
	public String getDrogaPrincipal() {
		return this.drogaPrincipal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void agregarSintoma(String sintoma) {
		if (!this.sintomas.contains(sintoma))
			this.sintomas.add(sintoma);
	}

	public boolean trataSintoma(String sintoma) {
		return this.sintomas.contains(sintoma);
	}
	
	public boolean equals(Object otro) {
		try {
			Medicamento otroM = (Medicamento)otro;
			return otroM.getNombre().equals(this.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", lab=" + lab + ", precio=" + precio + "]";
	}
	
	

}
