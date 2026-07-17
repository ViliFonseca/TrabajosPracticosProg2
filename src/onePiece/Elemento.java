package onePiece;

public abstract class Elemento  {

	protected String nombre;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}

	public String getNommbre() {
		return nombre;
	}

public abstract double getPeso();
public abstract int getEdad();
public int getCantidadPersonajes() {
	return 1;
}
public abstract int getFuerza();
}


