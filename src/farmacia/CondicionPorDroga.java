package farmacia;

public class CondicionPorDroga extends Condicion {
	private String droga;
	
	public CondicionPorDroga(String droga) {
		this.droga = droga;
	}
	
	public boolean cumple(Medicamento m) {
		return m.getDrogaPrincipal().equals(droga);
	}

}
