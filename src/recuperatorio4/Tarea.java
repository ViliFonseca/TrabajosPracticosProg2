package recuperatorio4;

import java.util.ArrayList;

public class Tarea extends ElementoTarea{
private String accion;
private double costo;
private int tiempo;
public Tarea(String accion, double costo, int tiempo) {
	super();
	this.accion = accion;
	this.costo = costo;
	this.tiempo = tiempo;
}
@Override
public double getCosto() {
	// TODO Auto-generated method stub
	return costo;
	
}
@Override
public int getTiempo() {
	// TODO Auto-generated method stub
	return tiempo;
}
@Override
public ArrayList<String> getAcciones() {
	ArrayList<String> retorno= new ArrayList<String>();
			retorno.add(accion);
	return retorno ;
}
@Override
public int cantidadTareas() {
	return 1;
}
@Override
public ElementoTarea copia(Condicion c) {
       if(c.cumple(this)) {
    	   Tarea copia = (Tarea) this.crearCascaron();
        if(copia != null) {
        	return copia;
        }
       return null;
       }

	return null;
}
public String getAccion() {
	return accion;
}
public void setAccion(String accion) {
	this.accion = accion;
}
@Override
public ElementoTarea crearCascaron() {
	return new Tarea(this.getAccion(),this.getCosto(),this.getTiempo());	
}


}
