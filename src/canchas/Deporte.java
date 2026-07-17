package canchas;

public class Deporte {
	  private String nombre;
	    private double precio;
	    private boolean disponible;

	    // Constructor
	    public Deporte(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.disponible = true; // Inicialmente disponible
	    }

	    // Getters y Setters
	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public boolean isDisponible() {
	        return disponible;
	    }

	    public void setDisponible(boolean disponible) {
	        this.disponible = disponible;
	    }	
}