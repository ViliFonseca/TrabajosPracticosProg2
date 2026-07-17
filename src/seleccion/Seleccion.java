package seleccion;			

public class Seleccion {
	public static void main(String[] args) {
     // nombre,  apellido,  numeroPasaporte,  fechaNacimiento, String estado, posicion  goles mano habil
		//String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, String estado, int añosExp, String titulo
		Persona jona = new Jugador("Jona","Pecho",44111133, null, "En casa", "Burro", -3, "izq");
	    Persona doc = new Masasjista("DOC", "DOCTOR", 44111133, null, "VIAJANDo", -3, "Burrologia");
		System.out.println(jona.estaHabilitado());
		System.out.println(doc.estaHabilitado());
		//public Entrenador(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNacimiento, String estado, String federacion)
		Persona rafa = new Entrenador("Rafa","Garcia",222,null,"Viajando","ARG");
		System.out.println(rafa.estaHabilitado());
		doc.setEstado("Hablitado");
		System.out.println(doc.estaHabilitado());

 	}

}
