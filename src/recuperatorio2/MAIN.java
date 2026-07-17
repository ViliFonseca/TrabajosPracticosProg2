package recuperatorio2;

public class MAIN {

	public static void main(String[] args) {
		  Especializacion raiz =  new Especializacion("Exactas", 1.4);
		  Especializacion c1 =  new Especializacion("Tudai", 1.4);
		  Especializacion c2 =  new Especializacion("Ingenieria", 1.4);
	        Curso Curso1 = new Curso("Progamacion", 20, 4);
	        Curso Curso2 = new Curso("Tio", 45, 2);
	        Curso Curso3 = new Curso("Analisis", 10, 6);
	        raiz.añadirElemento(Curso1);
	        raiz.añadirElemento(Curso2);
	        raiz.añadirElemento(c2);
	        c1.añadirElemento(Curso2);
	        c2.añadirElemento(Curso3);
	        System.out.println(raiz.Buscar(	new CondicionPrecio(20)));


}
}
