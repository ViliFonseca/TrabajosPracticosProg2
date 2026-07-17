package futbol5;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator {
    Comparator c1, c2;

    public ComparadorCompuesto(Comparator c1, Comparator c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Object o1, Object o2) {
		 int res = c1.compare(o1,o2);
	        if (res == 0)
	            return c2.compare(o1,o2);
	        return res;
	}
}
