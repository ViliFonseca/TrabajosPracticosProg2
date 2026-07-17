package coleccionables;

public class CondPrecio extends Condicion {
private double precioBuscado;
	
public CondPrecio(double precioBuscado) {
	this.precioBuscado = precioBuscado;
}

@Override
	public boolean cumple(Figura a) {
	return a.getPrecio()==precioBuscado;
	}

}
