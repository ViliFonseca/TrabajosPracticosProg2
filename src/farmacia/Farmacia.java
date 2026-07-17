package farmacia;

import java.util.ArrayList;

public class Farmacia {
	
	private ArrayList<Medicamento> medicamentos;
	//private Condicion condicionParaVender; // Las condiciones pueden reusarse para otras tareas (no estaba en el enunciado)

	public Farmacia() {
		this.medicamentos = new ArrayList<>();
	}
	
	public void agregarMedicamento(Medicamento nuevo) {
		if (!this.medicamentos.contains(nuevo))
			this.medicamentos.add(nuevo);
	}
	
	public ArrayList<Medicamento> buscarMedicamentos(Condicion condicion) {
		// Arreglo auxiliar, lo puedo devolver sin romper encapsulamiento pq no es un atributo del objeto
		ArrayList<Medicamento> resultados = new ArrayList<>();
		for (int i = 0; i < this.medicamentos.size(); i++) {
			Medicamento elemento_i = this.medicamentos.get(i);
			if (condicion.cumple(elemento_i))
				resultados.add(elemento_i);
		}
		
		return resultados;
	}
	

}
