package recuperatorio2;

public class CondicionPrecio extends Condicion {
private double precio;

public CondicionPrecio(double precio) {
	this.precio = precio;
}

@Override
public boolean cumple(ElementoCurso curso) {
	return curso.getPrecio() >= precio;
}

}
