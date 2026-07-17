package series;

public class Serie {
private String titulo;
private String descripcion;
private String creador;
Temporada[] temporadas;
String[] generos;

public Serie(String titulo, String descripcion,String creador,String[] generos,Temporada[] temporadas) {
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.creador = creador;
    this.generos = generos;
    this.temporadas =temporadas;
}



public String getTitulo() {
	return titulo;
}



public String getDescripcion() {
	return descripcion;
}



public String getCreador() {
	return creador;
}



public double getCalificacion() {
	return promedioCalificaciones();
}



public Temporada[] getTemporadas() {
	return temporadas;
}



public String[] getGeneros() {
	return generos;
}

public int cantidadCapitulosVistos() {
    int cantidadTotalCapitulosV = 0;
    for (int i = 0; i < this.temporadas.length; i++) {
      
            cantidadTotalCapitulosV+= temporadas[i].cantidadCapitulosVistos();
        
    }
    return cantidadTotalCapitulosV;
}
public boolean todosCapsVistos() { 
	int suma =0;
	for (int i = 0; i < this.temporadas.length; i++) {
		if(this.temporadas[i].seVieronTodosLosEpisodios() == true) {
			suma++;
		}
		
	}
	return suma == temporadas.length;
}


public double promedioCalificaciones() {
    int suma = 0;
    for (int i = 0; i < this.temporadas.length; i ++) {
        if (this.temporadas[i].getCalificacion() != -1) {
            suma += this.temporadas[i].getCalificacion();
        }
    }
 return suma/temporadas.length;   
}
}