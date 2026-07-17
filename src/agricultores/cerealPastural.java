package agricultores;

public class cerealPastural extends Cereal{
private int hectareasNec;

public cerealPastural(String nombre, int hectareasNec) {
	super(nombre);
	this.hectareasNec = hectareasNec;
}

public int getHectareasNec() {
	return hectareasNec;
}

public void setHectareasNec(int hectareasNec) {
	this.hectareasNec = hectareasNec;
}
public boolean sePuedeSembrar(Lote lote) {
	if(super.sePuedeSembrar(lote) && lote.getHectareas() == this.hectareasNec)
		return true;
	else
		return false;
}
}
