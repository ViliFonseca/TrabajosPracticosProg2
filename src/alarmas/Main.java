package alarmas;

public class Main {

	public static void main(String[] args) {
		Timbre a = new Timbre();
		Luz luz = new Luz();
	 Alarma ab = new Alarma(a);
	 ab.comprobar();
	 ab.setSeAbrioPuertaVentana(true);
	 ab.comprobar();
	 AlarmaLuminosa Luz = new AlarmaLuminosa(a,luz);
	 Luz.comprobar();
	 Luz.setSeRompioVidrio(true);
     Luz.comprobar();
	}

}
