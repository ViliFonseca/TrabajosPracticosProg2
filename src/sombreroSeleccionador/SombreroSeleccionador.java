package sombreroSeleccionador;


public class SombreroSeleccionador {

	public static void main(String[] args) {

Casa grifindor = new Casa("MARITA");
grifindor.agregarCualidades("valiente");
grifindor.agregarCualidades("temerario");
Alumno vili = new Alumno("Vili");
System.out.println(vili);
vili.añadirCualidades("valiente");
System.out.println(grifindor.perteneceCasa(vili));
vili.añadirCualidades("temerario");
System.out.println(grifindor.perteneceCasa(vili));
System.out.println(grifindor.getAlumnos());
CasaEnemistada huffe = new CasaEnemistada("Hufflepuf",grifindor);
huffe.agregarCualidades("honesto");
huffe.agregarCualidades("buenapersona");
vili.añadirCualidades("honesto");
vili.añadirCualidades("buenapersona");
huffe.agregarAlumno(vili);
grifindor.agregarAlumno(vili);
CasaExigente  sly = new CasaExigente("Slythering");
sly.agregarAlumno(vili);
System.out.println("LA CASA DE VILI ES " +  vili.getNombreCasa()); 
sly.agregarCualidades("Avaricioso");
sly.agregarCualidades("envidioso");
Alumno Alejandro = new Alumno("Alejandro");
Alejandro.añadirCualidades("valiente");
grifindor.agregarAlumno(Alejandro);
System.out.println(grifindor.getAlumnos());
	}
}