package onePiece;

public class FrutaFuerzaFija implements Fruta{
	  private int fuerza;

	    public FrutaFuerzaFija(int fuerza) {
	        this.fuerza = fuerza;
	    }

	    @Override
	    public int calcularFuerza(double peso, int fuerzaBase) {
	        return fuerza;
	    }
	}
