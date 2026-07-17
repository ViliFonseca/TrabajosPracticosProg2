package farmacia;

public class CondicionPorNombre extends Condicion {
	private String nombre;
	
	public CondicionPorNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean cumple(Medicamento m) {
		return m.getNombre().contains(this.nombre);
	}

}
