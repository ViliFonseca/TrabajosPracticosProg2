package recuperatorio;


public class Main {

	public static void main(String[] args) {
		  Combo raiz =  new Combo("raiz", 10);
		  Combo c1 =  new Combo("combo1", 1.4);
		  Combo c2 =  new Combo("combo2", 1.4);
	        Producto producto1 = new Producto(10, 150);
	        Producto producto2 = new Producto(20, 50);
	        Producto producto4 = new Producto(100, 250);

	        raiz.añadirElemento(producto4);
	        raiz.añadirElemento(c1);
	        raiz.añadirElemento(c2);
	        c1.añadirElemento(producto1);
	        c2.añadirElemento(producto1);
            c2.añadirElemento(producto4);
	        System.out.println(raiz.getPrecio());

	}

}
