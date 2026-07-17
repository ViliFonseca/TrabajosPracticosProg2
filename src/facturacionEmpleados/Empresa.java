package facturacionEmpleados;

import java.util.ArrayList;

public class Empresa {
private ArrayList<Empleado> empleados;
private String nombreEmp;
public Empresa(String nombreEmp) {
	super();
	this.empleados = new ArrayList<>();
	this.nombreEmp = nombreEmp;
}
public ArrayList<Empleado> getEmpleados() {
	return empleados;
}
public void añadirEmpleados(Empleado empleado) {
	empleados.add(empleado);
}
public String getNombreEmp() {
	return nombreEmp;
}
public void setNombreEmp(String nombreEmp) {
	this.nombreEmp = nombreEmp;
}
public double calcularSalariosTotales() {
	double suma = 0;
	for(Empleado empleado : empleados) {
		suma += empleado.getSueldo();
	}
return suma;
}
public static void main(String[] args) {
//(String nombre, String apellido, int dni, double sueldo)
	Empleado pepe = new Empleado("pepe", "garcia", 100,10.0);
//String nombre, String apellido, int dni, double sueldo, int cantidadVentas,double porcentaje
Empleado jose = new EmpleadoPorcentaje("jose", "martinez", 101,10.0,10,5);
//String nombre, String apellido, int dni, double sueldo, int cantidadVentas, int ventasMinimas, double bono
	Empleado tito  = new EmpleadoBono("tito","ramos",102,10,10,10,10);
Empresa vols = new Empresa("Volsvaghen");
vols.añadirEmpleados(tito);
vols.añadirEmpleados(jose);
vols.añadirEmpleados(pepe);
System.out.println(vols.calcularSalariosTotales());
}

}
