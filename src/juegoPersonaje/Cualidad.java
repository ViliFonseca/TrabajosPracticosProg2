package juegoPersonaje;

import java.util.Random;

public class Cualidad {
	private int[] nivelesCualidades;

	    private String[] nombresCualidades = {"vision nocturna", "velocidad", "fuerza", "peso", "altura", "edad"};

	    public Cualidad(int visionNocturna, int velocidad, int fuerza, int peso, int altura, int edad) {
	        this.nivelesCualidades = new int[]{visionNocturna, velocidad, fuerza, peso, altura, edad};
	    }

	    public int getNivelCualidad(String cualidad) {
	        for (int i = 0; i < nombresCualidades.length; i++) {
	            if (nombresCualidades[i].equalsIgnoreCase(cualidad)) {
	                return nivelesCualidades[i];
	            }
	        }
	        throw new IllegalArgumentException("Cualidad desconocida: " + cualidad);
	    }
	    
	        public String getCualidadAleatoria() {
	        Random random = new Random();
	        int indice = random.nextInt(nombresCualidades.length);
	        return nombresCualidades[indice];
	    }

}
