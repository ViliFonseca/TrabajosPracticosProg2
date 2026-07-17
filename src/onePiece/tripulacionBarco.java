package onePiece;

import java.util.ArrayList;

public class tripulacionBarco extends Elemento {
 public tripulacionBarco(String nombre) {
		super(nombre);
		elementos = new ArrayList<>();
	}

private ArrayList<Elemento> elementos;
	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFuerza() {
		// TODO Auto-generated method stub
		return 0;
	}

}
