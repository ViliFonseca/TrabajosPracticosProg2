package farmacia;

public class CondicionNot extends Condicion {
	private Condicion cond;
	
	public CondicionNot(Condicion cond) {
		this.cond = cond;
	}
	
	
	@Override
	public boolean cumple(Medicamento m) {
		return !cond.cumple(m);
	}

}
