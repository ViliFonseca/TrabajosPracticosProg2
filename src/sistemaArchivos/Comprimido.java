package sistemaArchivos;

import java.util.ArrayList;

import coleccionables.Condicion;

public class Comprimido extends Directorio{
    private double tasaCompresion;
    public Comprimido(String nombre, double tasa) {
        super(nombre);
        this.tasaCompresion = tasa;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio()*tasaCompresion;
    }

    @Override
    public int cantElementos() {
        return 1;
    }

    public ArrayList<Archivo> buscar(Condicion condicion) {
        return new ArrayList<>();
    }

    @Override
    protected Comprimido crearCascaron() {
        return new Comprimido(this.getNombre(), tasaCompresion);
    }
}
