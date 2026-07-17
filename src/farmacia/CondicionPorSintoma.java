package farmacia;

public class CondicionPorSintoma extends Condicion {

	private String sintoma;
	
	public CondicionPorSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
	@Override
	public boolean cumple(Medicamento m) {
		return m.trataSintoma(this.sintoma);
	}

}
