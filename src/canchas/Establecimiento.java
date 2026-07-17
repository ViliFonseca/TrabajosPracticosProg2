package canchas;

public class Establecimiento {
	    private Deporte[] deportes;
	    private Usuario[] usuarios;
	    private Turno[] turnos;
	    private int numDeportes;
	    private int numUsuarios;
	    private int numTurnos;

	    // Constructor
	    public Establecimiento(int maxDeportes, int maxUsuarios, int maxTurnos) {
	        this.deportes = new Deporte[maxDeportes];
	        this.usuarios = new Usuario[maxUsuarios];
	        this.turnos = new Turno[maxTurnos];
	        this.numDeportes = 0;
	        this.numUsuarios = 0;
	        this.numTurnos = 0;
	    }

	    // Agregar deporte
	    public void agregarDeporte(Deporte deporte) {
	        if (numDeportes < deportes.length) {
	            deportes[numDeportes++] = deporte;
	        } else {
	            System.out.println("No se pueden agregar más deportes.");
	        }
	    }

	    // Agregar usuario
	    public void agregarUsuario(Usuario usuario) {
	        if (numUsuarios < usuarios.length) {
	            usuarios[numUsuarios++] = usuario;
	        } else {
	            System.out.println("No se pueden agregar más usuarios.");
	        }
	    }

	    // Agregar turno
	    public void agregarTurno(Turno turno) {
	        if (numTurnos < turnos.length) {
	            if (turno.getDeporte().isDisponible()) {
	                turnos[numTurnos++] = turno;
	                turno.getUsuario().incrementarReservas(); // Incrementar reservas del usuario
	            } else {
	                System.out.println("La cancha no está disponible.");
	            }
	        } else {
	            System.out.println("No se pueden agregar más turnos.");
	        }
	    }

	    // Métodos para obtener deportes, usuarios y turnos
	    public Deporte[] getDeportes() {
	        return deportes;
	    }

	    public Usuario[] getUsuarios() {
	        return usuarios;
	    }

	    public Turno[] getTurnos() {
	        return turnos;
	    }

	    // Buscar turnos por usuario
	    public Turno[] buscarTurnosPorUsuario(Usuario usuario) {
	        Turno[] turnosUsuario = new Turno[numTurnos];
	        int count = 0;
	        for (int i = 0; i < numTurnos; i++) {
	            if (turnos[i].getUsuario().equals(usuario)) {
	                turnosUsuario[count++] = turnos[i];
	            }
	        }
	        Turno[] result = new Turno[count];
	        System.arraycopy(turnosUsuario, 0, result, 0, count);
	        return result;
	    }
	}


