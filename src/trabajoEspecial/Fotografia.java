package trabajoEspecial;
import trabajoEspecial.Condicion;
import java.time.LocalDate;
import java.util.ArrayList;

public class Fotografia extends ElementoFoto{
private String titulo;
private int identificador;
private int peso;
private ArrayList<String> lista;
private LocalDate fecha;
public Fotografia(String titulo, int identificador, int peso, LocalDate fecha) {
	super();
	this.titulo = titulo;
	this.identificador = identificador;
	this.peso = peso;
	this.lista = new ArrayList<String>();
	this.fecha = fecha;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getIdentificador() {
	return identificador;
}
public void setIdentificador(int identificador) {
	this.identificador = identificador;
}
public int getPeso() {
	return this.peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

public void addPersona(String persona) {
	if(!lista.contains(persona))
		lista.add(persona);
}
@Override
public int getCantidad() {
	return 1;
}
public ArrayList<String> getPersonas(){
	return new ArrayList<String>(lista);
	}
public ElementoFoto copia(Condicion c) {
	if(c.cumple(this)) {
		Fotografia copia = new Fotografia(this.getTitulo(),this.getIdentificador(),this.getPeso(), fecha);
		for(String persona : lista)
			copia.addPersona(persona);
	
	return copia;}

return null;
}
}
