package sueldos;

public class Empresa {

	public static void main(String[] args) {
		Empleado rama =  new Empleado("Ramiro",9);
		Empleado santi = new EmpleadoPorHorasExtras ("Santi", 1,1,1);
		Empleado Brunenger = new EmpleadoPorComision("BRG",1,1.10,10);
	    System.out.println(Brunenger.calcularSalario());
	    System.out.println(santi.calcularSalario());
	    System.out.println(rama.calcularSalario());
	}

}
