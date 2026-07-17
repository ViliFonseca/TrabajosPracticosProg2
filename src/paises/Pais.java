package paises;

public class Pais {

	public static void main(String[] args) {
	Impuesto imp1 = new Impuesto("imp1",50);
	Impuesto imp2 = new Impuesto("imp1",1);
	Impuesto imp3 = new Impuesto("imp1",60);
	Impuesto imp4 = new Impuesto("imp1",10);
	Impuesto imp5 = new Impuesto("imp1",40);
	Impuesto[] impuestos={imp1,imp2,imp3,imp4,imp5};
	Ciudad BuenosAires = new Ciudad("BuenosAires", 100, 1000, impuestos);
	Ciudad Olavarria = new Ciudad("Olavarria", 100, 100000, impuestos);
	Ciudad Azul = new Ciudad("Azul", 100, 100000, impuestos);
	Ciudad Azul2 = new Ciudad("MEXICO", 100, 100000, impuestos);
    Ciudad[] Ciudades= {BuenosAires,Olavarria,Azul,Azul2};
	System.out.println(BuenosAires.calcularRecaudado());
	System.out.println(BuenosAires.hayDeficit());
	Provincia BsAs = new Provincia("BuenosAires",Ciudades);
	System.out.println(BsAs.hayDeficit());
	BsAs.queCiudades();
	
	
	
	}
	
}
