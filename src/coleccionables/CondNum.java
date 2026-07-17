package coleccionables;

public class CondNum extends Condicion{
    private int num;

    public CondNum(int num) {
        this.num = num;
    }

    @Override
    public boolean cumple(Figura a) {
        return a.getNumero()==(num);
    }
}
