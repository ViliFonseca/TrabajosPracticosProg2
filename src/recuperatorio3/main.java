package recuperatorio3;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Coleccion raiz =  new Coleccion("Raiz");
		Coleccion c1 =  new Coleccion("Toy Story");
		Coleccion c2 =  new Coleccion("Max Stell");
	        Objeto Objeto1 = new Objeto("Buzz", "Disney", LocalDate.now(), 3, 200);
	        Objeto Objeto2 = new Objeto("Max Stell", "Matel", LocalDate.now(), 6, 150);
	        Objeto Objeto3 = new Objeto("Dado", "Dtoys", LocalDate.now(), 1, 400);
	        raiz.addElemento(c1);
	        raiz.addElemento(c2);
	        raiz.addElemento(Objeto3);
	        c1.addElemento(Objeto1);
	        c2.addElemento(Objeto2);
	        Objeto Objeto4 = new Objeto("Buzz", "Disney", LocalDate.now(), 3, 200);
	        System.out.println(raiz.getPrecio());


	}

}
