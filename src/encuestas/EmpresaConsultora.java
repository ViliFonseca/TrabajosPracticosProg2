package encuestas;

public class EmpresaConsultora {
 private Empleado[] empleados;
 private Encuesta[] encuestas;
 
 private int totalEmpleados;
 private int totalEncuestas;

 public EmpresaConsultora(int maxEmpleados, int maxEncuestas) {
     this.empleados = new Empleado[maxEmpleados]; // Se define el tamaño máximo del arreglo de empleados
     this.encuestas = new Encuesta[maxEncuestas]; // Se define el tamaño máximo del arreglo de encuestas
     this.totalEmpleados = 0;
     this.totalEncuestas = 0;
 }

 public void registrarEmpleado(Empleado empleado) {
     if (totalEmpleados < empleados.length) {
         empleados[totalEmpleados] = empleado;
         totalEmpleados++;
     } else {
         System.out.println("No se pueden agregar más empleados, el arreglo está lleno.");
     }
 }

 public void registrarEncuesta(Encuesta encuesta) {
     if (totalEncuestas < encuestas.length) {
         encuestas[totalEncuestas] = encuesta;
         totalEncuestas++;
     } else {
         System.out.println("No se pueden registrar más encuestas, el arreglo está lleno.");
     }
 }

 public Encuesta[] obtenerEncuestasDeEmpleado(Empleado empleado) {
     Encuesta[] encuestasDelEmpleado = new Encuesta[totalEncuestas];
     int contador = 0;
     for (int i = 0; i < totalEncuestas; i++) {
         if (encuestas[i].getEmpleado().equals(empleado)) {
             encuestasDelEmpleado[contador] = encuestas[i];
             contador++;
         }
     }
     // Redimensionar el arreglo para devolver solo las encuestas encontradas
     Encuesta[] resultado = new Encuesta[contador];
     System.arraycopy(encuestasDelEmpleado, 0, resultado, 0, contador);
     return resultado;
 }

 public Empleado buscarPersonaPorDocumento(int numeroDocumento) {
     for (int i = 0; i < totalEmpleados; i++) {
         if (empleados[i].getDni() == numeroDocumento) {
             return empleados[i];
         }
     }
     return null; // Si no se encuentra, se retorna null
 }

 public Empleado[] getEmpleados() {
     return empleados;
 }

 public Encuesta[] getEncuestas() {
     return encuestas;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Empleado pepe = new Empleado("Pepe","Rodriguez",10);
			Persona x = new Persona (44111133);
			Pregunta numero1 = new Pregunta("Sos gay?");
			Encuesta encu = new Encuesta(1, 2);
            encu.agregarPregunta(numero1);
            encu.realizarEncuesta(x, pepe);
            System.out.println(pepe.getEncuestasRespondidas());
			}
	}

