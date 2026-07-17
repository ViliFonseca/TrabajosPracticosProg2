package canchas;

import java.time.LocalDate;

public class Main {
	    public static void main(String[] args) {
	        Establecimiento club = new Establecimiento(5, 10, 20); // Máximo 5 deportes, 10 usuarios, 20 turnos

	        // Crear deportes
	        Deporte futbol = new Deporte("Fútbol", 400);
	        Deporte paddle = new Deporte("Paddle", 100);

	        // Agregar deportes al establecimiento
	        club.agregarDeporte(futbol);
	        club.agregarDeporte(paddle);

	        // Crear usuarios
	        Usuario juan = new Usuario("Juan Pérez","juan@gmail.com");

	        // Agregar usuarios al establecimiento
	        club.agregarUsuario(juan);
	        // Crear turnos
	        Turno turno1 = new Turno(LocalDate.now(), futbol, juan);

	        // Agregar turnos al establecimiento
	        club.agregarTurno(turno1);

	        // Intentar reservar otro turno en la misma cancha (debería fallar si la cancha no está disponible)
	        Turno turno2 = new Turno(LocalDate.now().plusDays(2), futbol, juan);
	        club.agregarTurno(turno2); // Debería imprimir que la cancha no está disponible

	        // Imprimir el precio del turno
	        System.out.println("Precio del turno: " + turno1.calcularPrecio());
	    }
	}

