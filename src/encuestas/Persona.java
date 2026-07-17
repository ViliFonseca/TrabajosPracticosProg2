package encuestas;

public class Persona {
	private int dni;
	public Persona(int dni) {
		this.dni = dni;
	}
	public boolean esMismaPersona(Persona otraPersona) {
		return this.dni == otraPersona.dni;
	}
}
