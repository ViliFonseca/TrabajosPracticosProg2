package juegoPersonaje;

public class Main {

	public static void main(String[] args) {
		
		//  visionNocturna,  velocidad,  fuerza,  peso,  altura,  edad) {
		        Cualidad cualidadesHeroe = new Cualidad(100, 550, 700, 80, 180, 30);
		        // visionNocturna,  velocidad,  fuerza,  peso,  altura,  edad) {
		        Cualidad cualidadesVillano = new Cualidad(90, 550, 700, 85, 175, 35);

		        Personaje heroe = new Personaje("Superman", cualidadesHeroe);
		        Personaje villano = new Personaje("Lex Luthor", cualidadesVillano);

		        String[] criterios = {"fuerza"};
		        Juego juego = new Juego(heroe, villano, criterios);
		        Personaje ganador = juego.enfrentar();

		        System.out.println("El ganador es: " + ganador.getNombre());
		    }
	}