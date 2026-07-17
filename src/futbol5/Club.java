package futbol5;

import java.util.ArrayList;

public class Club {
	private ArrayList<Socio> listaSocios;
	public Club() {
     this.listaSocios = new ArrayList<>();
	}
	public ArrayList<Socio> getListaSocios() {
		return listaSocios;
	}
public void agregarSocio(Socio a) {
	listaSocios.add(a);
}
}
