package series;

public class Temporada {
private int numerotemporada;
private Capitulo[] capitulos;
public Temporada() {
    this.numerotemporada = 0;
    this.capitulos = new Capitulo[0]; 
}
public Temporada(int numeroTemporada, Capitulo[] capitulos) {
    this.numerotemporada = numeroTemporada;
    this.capitulos = capitulos;
}

public int getNumerotemporada() {
	return numerotemporada;
}

public void setNumerotemporada(int numerotemporada) {
	this.numerotemporada = numerotemporada;
}

public Capitulo[] getCapitulos() {
	return capitulos;
}
public double getCalificacion() {
return promedioCalificaciones();
}

public void setCapitulos(Capitulo[] capitulos) {
	this.capitulos = capitulos;
}

public int cantidadCapitulosVistos() {
    int cantidadCapitulosV = 0;
    for (int i = 0; i < this.capitulos.length; i++) {
        if (capitulos[i].isVisto()) {
            cantidadCapitulosV++;
        }
    }
    return cantidadCapitulosV;
}


public boolean seVieronTodosLosEpisodios() {
    return cantidadCapitulosVistos() == this.capitulos.length;
}

public double promedioCalificaciones() {
    int suma = 0;
    for (int i = 0; i < this.capitulos.length; i ++) {
        if (this.capitulos[i].getCalificacion() != -1) {
            suma += this.capitulos[i].getCalificacion();
        }
    }
    return (double) suma/capitulos.length;
}

}