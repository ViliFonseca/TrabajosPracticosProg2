package trabajoEspecial;

import java.time.LocalDate;
import java.util.ArrayList;

import fotos.Condicion;

public abstract class ElementoFoto implements Comparable<ElementoFoto> {
	public abstract int getCantidad();
	public abstract ArrayList<String> getPersonas();
	public abstract LocalDate getFecha();
	public abstract int getPeso();
	public abstract ElementoFoto copia(trabajoEspecial.Condicion c); 
	public int compareTo(ElementoFoto o) {
        int resul = this.getFecha().compareTo(o.getFecha());
        if (resul == 0)
            return Double.compare(this.getPeso(), o.getPeso());
        return resul;
    }

}
