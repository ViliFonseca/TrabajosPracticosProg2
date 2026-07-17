package conversorDeUnidades;

public class ConversorUnidades {
 private static final double pulgadaACentimetro = 2.54;
 private static final double libraAKilos = 0.453592;
 private static final double galonALitros = 3.78541;
 
 
 public static final double convertidorCentimetroPulgada(double a) {
    return a / pulgadaACentimetro;
 } 
 
 public static final double convertidorPulgadaCentimetro(double a) {
	    return a * pulgadaACentimetro;
	 } 
 public static final double convertidorLibraAKilos(double a) {
	    return a * libraAKilos;
	 } 
 public static final double convertidorKiloslibras(double a) {
	    return a / libraAKilos;
	 } 
 public static final double convertidorGalonLitros(double a) {
	    return a * galonALitros;
	 } 
 public static final double convertidorLitroGalon(double a) {
	    return a / galonALitros;
	 } 
	 
}
