	package encuestas;
	
	public class Encuesta {
		    private int id;
		    private Pregunta[] preguntas;
		    private Persona persona;
		    private Empleado empleado;
		    private int totalPreguntas; // Para llevar el conteo de preguntas agregadas

		    public Encuesta(int id, int maxPreguntas) {
		        this.id = id;
		        this.preguntas = new Pregunta[maxPreguntas]; // Se define el tamaño máximo del arreglo
		        this.totalPreguntas = 0;
		    }

		    public void agregarPregunta(Pregunta pregunta) {
		        if (totalPreguntas < preguntas.length) {
		            preguntas[totalPreguntas] = pregunta;
		            totalPreguntas++;
		        } else {
		            System.out.println("No se pueden agregar más preguntas, el arreglo está lleno.");
		        }
		    }

		    public void realizarEncuesta(Persona persona, Empleado empleado) {
		        if (this.persona == null || !this.persona.esMismaPersona(persona)) {
		            this.persona = persona;
		            this.empleado = empleado;
		            empleado.aumentarEncuestasrespondidas(); // Incrementa la cantidad de encuestas realizadas por el empleado
		        } else {
		            System.out.println("Esta persona ya ha realizado esta encuesta.");
		        }
		    }

		    public boolean esEncuestaRealizadaPor(Persona persona) {
		        return this.persona != null && this.persona.esMismaPersona(persona);
		    }

		    public Pregunta[] getPreguntas() {
		        return preguntas;
		    }

		    public Empleado getEmpleado() {
		        return empleado;
		    }

		    public int getId() {
		        return id;
		    }
		}

