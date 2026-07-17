package alarmas;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;
	public AlarmaLuminosa(Timbre  timbre, Luz luz) {
		super(timbre);
	    this.luz = luz;
	}


public void comprobar() {
	if(this.isSeAbrioPuertaVentana() || this.isSeDetectoMovimiento() || this.isSeRompioVidrio())
	    luz.Encender();
	else 
		System.out.println("Estado de la PUERTA O VENTANA : " + this.isSeAbrioPuertaVentana() + "SE DETECTO MOVIMIENTO : "+this.isSeDetectoMovimiento() + "SE ROMPIO VIDRIO:"+this.isSeRompioVidrio() );
}

}
