package avicola;

public class Empresa {

	public static void main(String[] args) {
		// fechaCaducidad, numeroDeLote,fechaEnvasado,granjaOrigen, codigo,temperaturaRecomendada, metodoCongelacion,tiempoExposicionNitrogeno)
    CongeladoPorNitrogeno producto = new CongeladoPorNitrogeno(null, 12345, null, "Los pollos", 123455, -20, "Inmersión Rápida", 300);
    System.out.println(producto.getEtiqueta());
		    }
	}

