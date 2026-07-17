package recuperatorio2;

import java.util.ArrayList;
public abstract class ElementoCurso {
	private String nombre;
public ElementoCurso(String nombre) {
		super();
		this.nombre = nombre;
	}
public abstract double getPrecio();
public abstract int cantidadCursos();
public abstract ArrayList<String> getPalabrasclave();
public abstract double cantidadHoras();
public abstract Curso cursoMasCaro();
public abstract ArrayList<Curso> Buscar(Condicion c);
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
}
