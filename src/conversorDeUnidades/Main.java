package conversorDeUnidades;

public class Main {

	public static void main(String[] args) {
		double kilosAlibras = ConversorUnidades.convertidorKiloslibras(30);
       System.out.println(kilosAlibras);
       double librasAkilos= ConversorUnidades.convertidorLibraAKilos(kilosAlibras);
       System.out.println(librasAkilos);
       double galon = ConversorUnidades.convertidorGalonLitros(30);
	   System.out.println(galon);
	   double litros = ConversorUnidades.convertidorLitroGalon(galon);
	   System.out.println(litros);
	   double centimetros = ConversorUnidades.convertidorPulgadaCentimetro(galon);
	   System.out.println(centimetros);
	   double pulgadas = ConversorUnidades.convertidorCentimetroPulgada(galon);
	   System.out.println(pulgadas);
	}

}
