package parcialNoticias;

public class Noticia extends ElementoNoticia {
private String contenido;
private String titulo;
private String autor;
@Override
public ElementoNoticia copia(Condicion c) {
    if(c.cumple(this))
    	return new Noticia(this.getCategoria(),this.contenido, this.titulo,this.autor);

	else return null;	}
public Noticia(String categoria, String contenido, String titulo, String autor) {
	super(categoria);
	this.contenido = contenido;
	this.titulo = titulo;
	this.autor = autor;
}

}
