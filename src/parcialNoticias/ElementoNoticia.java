package parcialNoticias;

public abstract class ElementoNoticia {
private String categoria;
public abstract ElementoNoticia copia(Condicion c);
public ElementoNoticia(String categoria) {
	super();
	this.categoria = categoria;
}
public String getCategoria() {
	return categoria;
}

}
