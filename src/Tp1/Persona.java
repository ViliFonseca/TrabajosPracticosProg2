package Tp1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int dni;
    private LocalDate fechadenacimiento;
    private String sexo;
    private String nombre;
    private String apellido;
    private double peso;
    private double altura;
    private int edad;
    
    
    
	public Persona(int dni,  LocalDate fechadenacimiento, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.fechadenacimiento = fechadenacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(int dni) {
		this.dni = dni;
		this.fechadenacimiento =LocalDate.of(2001, 1, 1);
		this.edad = 24;
		this.sexo = "femenino";
		this.nombre = "N";
		this.apellido = "N";
		this.peso = 1;
		this.altura = 1;
	}
	public void setFechadenacimiento(LocalDate fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDni() {
		return dni;
	}
	public LocalDate getFechadenacimiento() {
		return fechadenacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	
	public String getAll() {
		return dni + "  " + nombre + " " + apellido + " " + sexo + " " + peso + " " + altura + " " + fechadenacimiento;
	}
	
	
	public double calcularIndice() {
	
		return this.peso/(this.altura*this.altura); 
	}
	
	public boolean estaEnForma() {
		return calcularIndice() > 18.5;
	}

	 public int calcularEdad() {
	        LocalDate fechaActual = LocalDate.now();
	        return Period.between(fechadenacimiento, fechaActual).getYears();
	    }
	 public boolean esMayorEdad() {
		 return calcularEdad() >=18;
		 
	 }
	
	 public boolean esMayorde16() {
		 return calcularEdad() >=16;
		 
	 }
	 public boolean verificarEdad() {
		 return calcularEdad() == this.edad;
	 }
	public static void main(String[] args) {
		Persona a = new Persona(44111133);
		System.out.println(a.verificarEdad());
		a.setEdad(23);
		System.out.println(a.verificarEdad());
	

}
}