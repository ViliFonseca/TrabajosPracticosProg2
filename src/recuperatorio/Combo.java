package recuperatorio;

import java.util.ArrayList;
public class Combo extends ElementoProducto {
public Combo(String nombre, double descuento) {
		this.nombre=nombre;
		this.descuento= descuento;
		this.lista = new ArrayList<ElementoProducto>();
		}
private String nombre;
private ArrayList<ElementoProducto> lista;
private double descuento;
private static double descuentoMax;
	@Override
	public double getPrecio() {
		double suma = 0;
		double desc = (this.getCantidad()*this.getDescuento())/100;
		for(ElementoProducto prod : lista) {
				suma += prod.getPrecio();		      
		
		}
		return suma - suma * desc;}
		
	
	public double getDescuento() {
		return this.descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public static double getDescuentoMax() {
		return descuentoMax;
	}

	public static void setDescuentoMax(int descuentoMax) {
		Combo.descuentoMax = descuentoMax;
	}

	@Override
	public int getCantidad() {
		int suma =0;
		for (ElementoProducto prod  : lista) {
			suma+= prod.getCantidad();
		}
				return suma;
	}

	@Override
	public int getPeso() {
		int suma = 0;
		for(ElementoProducto prod : lista) {
			suma+= prod.getPrecio();
		}
			return suma;
	}

public void añadirElemento(ElementoProducto p) {
     this.lista.add(p);
}
}
