package farmacia;

public class CondicionPorLab extends Condicion {
	private String lab;
	
	public CondicionPorLab(String lab) {
		this.lab = lab;
	}
	
	public boolean cumple(Medicamento m) {
		return m.getLab().equals(this.lab);
	}
}
