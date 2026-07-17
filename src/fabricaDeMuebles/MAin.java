package fabricaDeMuebles;

public class MAin {

	public static void main(String[] args) {
		//public Producto(double peso, double costo, double porcentaje, String color, String tipoMadera)
		
		Producto Silla = new Producto(5, 30,35,"verde","bonsai");
		
      //public Fabrica(int capacidadMaxima) 
	Fabrica sillas= new Fabrica(2);
	sillas.agregarProducto(Silla);
	sillas.agregarProducto(Silla);
	System.out.println(sillas.calcularCostoTotal());
	System.out.println(sillas.calcularPrecioVenta());
	sillas.agregarProducto(Silla);
	}
	}
