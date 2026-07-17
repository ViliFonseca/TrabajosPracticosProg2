package coleccionables;

import sistemaArchivos.Archivo;

public abstract class Condicion {
    public abstract boolean cumple(Archivo a);

    public boolean cumple(Figura a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cumple'");
    }
}
