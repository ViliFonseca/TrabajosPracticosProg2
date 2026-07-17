package canchas;

import java.time.LocalDate;

public class Turno{
	    private LocalDate horario;
	    private Deporte deporte;
	    private Usuario usuario;

	    // Constructor
	    public Turno(LocalDate horario, Deporte deporte, Usuario usuario) {
	        this.horario = horario;
	        this.deporte = deporte;
	        this.usuario = usuario;
	        this.deporte.setDisponible(false); // La cancha ya no está disponible al reservar
	    }

	    // Getters
	    public LocalDate getHorario() {
	        return horario;
	    }

	    public Deporte getDeporte() {
	        return deporte;
	    }

	    public Usuario getUsuario() {
	        return usuario;
	    }

	    // Calcular precio final para el usuario (incluyendo descuento si es socio)
	    public double calcularPrecio() {
	        return usuario.calcularPrecio(deporte.getPrecio());
	    }
	}

