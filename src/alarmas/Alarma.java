package alarmas;

public class Alarma {
 private boolean seRompioVidrio;
 private boolean seAbrioPuertaVentana;
 private boolean seDetectoMovimiento;
 private Timbre timbre;
 
 
public Alarma(Timbre timbre) {
	this.timbre = timbre;
}
public boolean isSeRompioVidrio() {
	return seRompioVidrio;
}
public boolean isSeAbrioPuertaVentana() {
	return seAbrioPuertaVentana;
}
public boolean isSeDetectoMovimiento() {
	return seDetectoMovimiento;
}
 
public void comprobar() {
	if (isSeRompioVidrio() || isSeAbrioPuertaVentana() || isSeDetectoMovimiento())
	timbre.hacerSonar();
	else 
		System.out.println("NO PASO NADA");
}
public void setSeRompioVidrio(boolean seRompioVidrio) {
	this.seRompioVidrio = seRompioVidrio;
}
public void setSeAbrioPuertaVentana(boolean seAbrioPuertaVentana) {
	this.seAbrioPuertaVentana = seAbrioPuertaVentana;
}
public void setSeDetectoMovimiento(boolean seDetectoMovimiento) {
	this.seDetectoMovimiento = seDetectoMovimiento;
}

}
