package futbol5;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Socio>{
	    
@Override
public int compare(Socio o1, Socio o2) {
	// TODO Auto-generated method stub
	return o1.getApellido().compareTo(o2.getApellido());
}

}
