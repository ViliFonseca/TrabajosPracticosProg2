package sombreroSeleccionador;

import java.util.ArrayList;

public class CasaExigente extends Casa {
public CasaExigente(String nombre) {
		super(nombre);
	}
public boolean perteneceCasa(Alumno a) {
	if(super.perteneceCasa(a) && tieneFamiliar(a) ) 
	return true;
else
	return false;
}


public boolean tieneFamiliar(Alumno alumno) {
    ArrayList<Alumno> familiaresAlumno = alumno.getFamiliares();
    for (Alumno alumno1 : this.getAlumnos()) {
        for (Alumno familiarAlumno : familiaresAlumno) {
            if (familiarAlumno.equals(alumno1)) {
              return true;   
            }
        }
    }
    return false;  


}
}
