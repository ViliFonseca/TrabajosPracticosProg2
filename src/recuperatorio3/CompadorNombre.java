package recuperatorio3;

import java.util.Comparator;

public class CompadorNombre implements Comparator<Objeto>{


	@Override
	public int compare(Objeto o1, Objeto o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
