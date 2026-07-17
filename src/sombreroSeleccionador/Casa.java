package sombreroSeleccionador;

import java.util.ArrayList;

public class Casa {
private String nombre;
protected ArrayList<String> cualidadesCasa;
private final int CantidadMaxima = 10;
protected ArrayList<Alumno> alumnos;


public Casa(String nombre) {
	super();
	this.nombre = nombre;
	this.cualidadesCasa = new ArrayList<>();
	 this.alumnos = new ArrayList<>();
	 }
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
}
public ArrayList<Alumno> getAlumnos(){
	return alumnos;
}
public void agregarCualidades(String cualidad) {
	cualidadesCasa.add(cualidad);
}
public void agregarAlumno(Alumno alumno){
	int alumnosCant = alumnos.size();
	if (this.CantidadMaxima >= alumnosCant && perteneceCasa(alumno) && !alumno.tieneCasa()) {
			alumnos.add(alumno);
	        alumno.setTieneCasa();
	        alumno.setNombreCasa(this.getNombre());
	}
	else 
			System.out.println("EL ALUMNO " + alumno.getNombre() + "   NO PERTENECE A   "+ this.getNombre() );
		}
public int getCantidadMaxima() {
	return CantidadMaxima;
}
public ArrayList<String> getCualidades() {
	return cualidadesCasa;
}
public boolean perteneceCasa(Alumno alumno) {
	int cantidadCualidad = 0;
    ArrayList<String> cualidadesAlumno = alumno.getCualidades();
    for (String cualidadCasa : cualidadesCasa) {
        for (String cualidad : cualidadesAlumno) {
            if (cualidad.equals(cualidadCasa)) {
              cantidadCualidad++;   
            }
        }
    }
    return cantidadCualidad >= 1;  


}
}


