package farmacia;

public class CondicionPorPrecio extends Condicion {

	private double precio;
	
	public CondicionPorPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean cumple(Medicamento m) {
		return m.getPrecio() < precio;
	}

}
