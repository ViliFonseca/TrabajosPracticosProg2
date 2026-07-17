package Tp1;

public class Electrodomestico {
     String color;
     int peso;
     double precio;
     int consumo;
     String nombre;


     public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public Electrodomestico(String color, int peso, double precio, int consumo) {
		this.color = color;
		this.peso = peso;
		this.precio = precio;
		this.consumo = consumo;
	}

	public Electrodomestico(String color, int peso, double precio) {
		this.color = color;
		this.peso = peso;
		this.precio = precio;
		this.consumo = 10;
	}
	public Electrodomestico(String color, int peso) {
		this.color = color;
		this.peso = peso;
		this.precio = 100;
		this.consumo = 10;
	}
	public Electrodomestico(String color) {
		this.color = color;
		this.peso = 2;
		this.precio = 100;
		this.consumo = 10;
	}
	public Electrodomestico() {
		this.color = "Plata";
		this.peso = 2;
		this.precio = 100;
		this.consumo = 10;
	}
	public boolean calcularConsumo(){
		return this.consumo <= 45;
	}
	public double calcularBalance() {
	 double balance = (this.precio /this.peso);
	 return balance;
	}
	public boolean esAltagama() {
	 return calcularBalance() >= 3;
	}
	
	public static void main(String[] args) {
		Electrodomestico lavadora = new Electrodomestico();
        System.out.println("La lavadora es de bajo consumo?:" + lavadora.calcularConsumo());
        System.out.println("la lavadora es alta gama: " + lavadora.esAltagama());
	}

}
