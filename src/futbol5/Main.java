package futbol5;

import java.util.Collections;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		Club club = new Club();

        Socio socio1 = new Socio("Juan", "Lopez", 20, true);
        Socio socio2 = new Socio("Luis", "Rodríguez", 17, false);
        Socio socio3 = new Socio("Juan", "Ardiles", 25, true);
        socio1.alquilarCancha(new Cancha (13, 600));
        socio2.alquilarCancha(new Cancha( 12, 300));
        socio3.alquilarCancha(new Cancha( 13, 700));

        club.agregarSocio(socio1);
        club.agregarSocio(socio2);
        club.agregarSocio(socio3);
	    System.out.println(club.getListaSocios());
    	Collections.sort(club.getListaSocios(), new ComparadorNombre());
	    System.out.println(club.getListaSocios());
	    Comparator<Socio> compNombre = new ComparadorNombre();
	    Comparator<Socio> compApellido = new ComparadorApellido();
	    Collections.sort(club.getListaSocios(), new ComparadorCompuesto(compNombre, compApellido));
	    System.out.println(club.getListaSocios());

	}

}
