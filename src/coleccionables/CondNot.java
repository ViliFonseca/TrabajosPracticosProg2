package coleccionables;
public class CondNot extends Condicion{
    Condicion directa;

    public CondNot(Condicion directa) {
        this.directa = directa;
    }

    @Override
    public boolean cumple(Figura a) {
        return !directa.cumple(a);
    }
}
