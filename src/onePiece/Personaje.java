package onePiece;

public class Personaje extends Elemento {
private int edad;
private double peso;
private Fruta fruta;
private int fuerza;
public Personaje(String nombre, int edad, double peso,Fruta fruta) {
	super(nombre);
	this.edad = edad;
	this.peso = peso;
	this.fruta = fruta;
	
}
	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public int getEdad() {
		return edad;
	}
	@Override
	public int getFuerza() {
		// TODO Auto-generated method stub
		return 0;
	}


}
