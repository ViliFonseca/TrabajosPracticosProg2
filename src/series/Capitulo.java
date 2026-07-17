package series;

public class Capitulo {
 private double calificacion;
 private String titulo;
 private String descripcion;
 private boolean visto;
public Capitulo(double calificacion, String titulo, String descripcion, boolean visto) {
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.visto = visto;
    this.calificacion = calificacion;
}
public double getCalificacion() {
	return calificacion;
}
public String setCalificacion(int calificacion) {
    if(calificacion >= 1 && calificacion <= 5){
        this.calificacion = calificacion;
        return "Gracias por su contribucion";
    } else {
        return "El valor ingresado es incorrecto.";
    }
    
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getDescripcion() {
	return descripcion;
}
public boolean isVisto() {
	return visto;
}
public void setVisto(boolean visto) {
	  this.visto = visto;
      if (calificacion != 0) {
         calificacion = visto ? Math.abs(calificacion) : -Math.abs(calificacion);
      }
}


}
