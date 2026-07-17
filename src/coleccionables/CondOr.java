package coleccionables;

public class CondOr {
    Condicion c1, c2;

    public CondOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Figura a) {
        return c1.cumple(a) || c2.cumple(a);
    }
}


