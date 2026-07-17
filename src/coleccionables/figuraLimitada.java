package coleccionables;

public class figuraLimitada extends Figura {
  private int numeroUni;
  private int multiplicador;
	public figuraLimitada(String nombre, String album, int numero, double precio,int numeroUni, int multiplicador) {
		super(nombre, album, numero, precio);
	   this.numeroUni =numeroUni;
	   this.multiplicador = numero;
	}
@Override
public double getPrecio() {
	return super.getPrecio()*this.multiplicador - this.numeroUni;
	
}


}
