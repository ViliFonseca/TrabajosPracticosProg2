package recuperatorio4;

import java.util.ArrayList;

public class TareaCompuestaRepetitiva extends TareaCompuesta{
	private int multiplicador;

	public TareaCompuestaRepetitiva(int multiplicador) {
		super();
		this.multiplicador = multiplicador;
	}


	public double getCosto() {
	return super.getCosto() * multiplicador;
	}

	@Override
	public int getTiempo() {
		return super.getTiempo() * this.multiplicador;
	}

	@Override
	public ArrayList<String> getAcciones() {
		ArrayList<String> retorno = new ArrayList<String>();
		for(int i = 0; i < multiplicador; i++) {
		for(ElementoTarea elem: tareas) {
			retorno.addAll(elem.getAcciones());   
		}
	}
		return retorno;

}
	
	public ElementoTarea crearCascaron() {
		return new TareaCompuesta();
	}

}
