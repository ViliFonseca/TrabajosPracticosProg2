package congresoComputacion;

import java.util.ArrayList;

public class SistemaAsignacion {
private ArrayList<Evaluador> evaluadores;
private ArrayList<Trabajo> trabajos;
public SistemaAsignacion(ArrayList<Evaluador> evaluadores, ArrayList<Trabajo> trabajos) {
	this.evaluadores = new ArrayList<>();
	this.trabajos = new ArrayList<>();
}
public ArrayList<Evaluador> getEvaluadores() {
	return evaluadores;
}
public ArrayList<Trabajo> getTrabajos() {
	return trabajos;
}
public boolean asignarTrabajo(Trabajo trabajo) {
      for (Evaluador evaluador : evaluadores )
    	  if(evaluador.esAptoParaTrabajo(trabajo)) {
    		  evaluador.agregarTrabajo(trabajo);
              return true;
                } 
      return false;}

public ArrayList<Trabajo> obtenerTrabajos(Evaluador evaluador){
	 ArrayList<Trabajo> trabajosAsignables = new ArrayList<>();
	 for (Trabajo trabajo : trabajos) {
		 if(evaluador.esAptoParaTrabajo(trabajo))
			 trabajosAsignables.add(trabajo);
	 }
     return trabajosAsignables;}
public ArrayList<Evaluador> obtenerEvaluadores(Trabajo trabajo){
	 ArrayList<Evaluador> evaluadoresPosibles = new ArrayList<>();
	 for (Evaluador evaluador : evaluadores) {
		 if(evaluador.esAptoParaTrabajo(trabajo))
			 evaluadoresPosibles.add(evaluador);
	 }
    return evaluadoresPosibles;}
}

