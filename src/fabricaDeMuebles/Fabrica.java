package fabricaDeMuebles;

public class Fabrica {
private Producto[] stock;
private int cantidadAct;
public Producto[] getStock() {
	return stock;
}
public int getCantidadAct() {
	return cantidadAct;
}
public Fabrica(int capacidadMaxima) {
	super();
	this.stock =  new Producto[capacidadMaxima];
	this.cantidadAct = 0;
}
public void agregarProducto(Producto producto) {
	if(cantidadAct < stock.length) {
		stock[cantidadAct] = producto;
		cantidadAct++;
	}else {
		System.out.println("NO HAY MAS CAPACIDAD EN EL STOCK, NO SE PUEDE AGREGAR MAS PRODUCTOS");
	}
}
public double calcularCostoTotal() {
	double total=0;
	for (int i = 0; i < cantidadAct; i++) {
		total += stock[i].getCosto();
	}
			
	return total;
}



public double calcularPrecioVenta() {
	double total = 0;
	for (int i = 0; i < cantidadAct; i++) {
		total += stock[i].getPrecio();
	}
	return total;
}


public String mostrarStock() {
	String todo = "";
	for (int i = 0; i < cantidadAct; i++) {
	 todo += " " +stock[i].mostrarInformacion();
	}
	return todo;
}
}
