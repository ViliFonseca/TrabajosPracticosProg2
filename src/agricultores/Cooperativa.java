package agricultores;

import java.util.ArrayList;

public class Cooperativa {
private ArrayList<Lote> lotes;
private ArrayList<String> mineralesEsp;
private ArrayList<Cereal> cereales;
private String nombre;

public void añadirMineral(String mineral) {
	mineralesEsp.add(mineral);
}

public void añadirLote(Lote lote) {
	lotes.add(lote);
}
public void añadirCereal(Cereal cereal) {
	cereales.add(cereal);
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Cooperativa(String nombre) {
	this.lotes = new ArrayList<>();
	this.mineralesEsp =new ArrayList<>();
	this.cereales = new ArrayList<>();
	this.nombre = nombre;
}
public ArrayList<Lote> obtenerLotesParaCereal(Cereal cereal) {
    ArrayList<Lote> sembrables = new ArrayList<>();
    for (Lote lote : lotes) {
        if (cereal.sePuedeSembrar(lote)) {
            sembrables.add(lote);
        }
    }
    return sembrables;
}
public ArrayList<Cereal> obtenerCerealesParaLote(Lote lote){
	 ArrayList<Cereal> listaCereales = new ArrayList<>();
	    for (Cereal cereal : cereales) {
	        if (lote.contieneMinerales(cereal)) {
	            listaCereales.add(cereal);
	        }
	    }
	    return listaCereales;
}
public boolean esEspecial(Lote lote) {
	ArrayList<String> listaMinerales = lote.getMinerales();
        for(String mineralEsp : mineralesEsp) {
		for(String listaMineral : listaMinerales) {
			  if(listaMineral.equals(mineralEsp)) {
				lote.setEsEspecial(true);;
			  }
			  }
			  
}return lote.isEsEspecial();

}

public static void main(String[] args) {
	Cereal c1 = new Cereal("MAIZ");
	c1.añadirMineral("calcio");
	c1.añadirMineral("zinc");
	Lote l1 = new Lote(1,50);
	l1.añadirMineral("calcio");
	l1.añadirMineral("banana");
	l1.añadirMineral("zinc");
	System.out.println(c1.sePuedeSembrar(l1));
	Cereal c2 = new Cereal("MAIZ");
	c2.añadirMineral("calcio");
	c2.añadirMineral("zinc");
	Cooperativa coop = new Cooperativa("COOPERATIVA OBRERA");
	coop.añadirCereal(c2);
	coop.añadirCereal(c1);
	coop.añadirLote(l1);
	Lote l2 = new Lote(2,2);
	l2.añadirMineral("Banana");
	l2.añadirMineral("MERCA");
	coop.añadirLote(l2);
	System.out.println(coop.obtenerLotesParaCereal(c1));
	coop.añadirMineral("MERCA");
	System.out.println(coop.esEspecial(l1));
}
}
