package recuperatorio4;

import java.util.ArrayList;

public abstract class ElementoTarea {
public abstract double getCosto();
public abstract int getTiempo();
public abstract ArrayList<String> getAcciones();
public abstract int cantidadTareas();
public abstract ElementoTarea copia(Condicion c);
public abstract ElementoTarea crearCascaron();

}
