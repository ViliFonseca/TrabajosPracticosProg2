package sombreroSeleccionador;

public class CasaEnemistada extends Casa {
private Casa casaRival;
	public CasaEnemistada(String nombre,Casa casaRival) {
		super(nombre);
		this.casaRival = casaRival;
	}
public boolean perteneceCasaRival(Alumno alumno,Casa casaRival) {
   if(casaRival.perteneceCasa(alumno)) {
	   return false;
   }else
	   return true;
   }

public boolean perteneceCasa(Alumno a) {
	if(super.perteneceCasa(a) && perteneceCasaRival(a,casaRival)) 
	return true;
else
	return false;
}
}