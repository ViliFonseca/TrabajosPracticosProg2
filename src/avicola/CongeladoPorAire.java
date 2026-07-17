package avicola;

import java.time.LocalDate;

public class CongeladoPorAire extends ProductoCongeladoRefrigerado {
		private double porcentajeNitrogeno;
		private double porcentajeDioxido;
		private double porcentajeCarbono;
		private double porcentajeVaporAgua;
		public CongeladoPorAire(LocalDate fechaCaducidad, int numeroDeLote, LocalDate fechaEnvasado,
				String granjaOrigen, int codigo, int temperaturaRecomendada, double porcentajeNitrogeno,
				double porcentajeDioxido, double porcentajeCarbono, double porcentajeVaporAgua) {
			super(fechaCaducidad, numeroDeLote, fechaEnvasado, granjaOrigen, codigo, temperaturaRecomendada);
			this.porcentajeNitrogeno = porcentajeNitrogeno;
			this.porcentajeDioxido = porcentajeDioxido;
			this.porcentajeCarbono = porcentajeCarbono;
			this.porcentajeVaporAgua = porcentajeVaporAgua;
		}
		public double getPorcentajeNitrogeno() {
			return porcentajeNitrogeno;
		}
		public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
			this.porcentajeNitrogeno = porcentajeNitrogeno;
		}
		public double getPorcentajeDioxido() {
			return porcentajeDioxido;
		}
		public void setPorcentajeDioxido(double porcentajeDioxido) {
			this.porcentajeDioxido = porcentajeDioxido;
		}
		public double getPorcentajeCarbono() {
			return porcentajeCarbono;
		}
		public void setPorcentajeCarbono(double porcentajeCarbono) {
			this.porcentajeCarbono = porcentajeCarbono;
		}
		public double getPorcentajeVaporAgua() {
			return porcentajeVaporAgua;
		}
		public void setPorcentajeVaporAgua(double porcentajeVaporAgua) {
			this.porcentajeVaporAgua = porcentajeVaporAgua;
		}

	public String getEtiqueta() {
		return super.getEtiqueta() + "Porcentaje de Nitrogeno: " + this.getPorcentajeNitrogeno() +  "Porcentaje de Carbono " + this.getPorcentajeCarbono()
		+ "Porcentaje de Dioxido: " + this.getPorcentajeDioxido() + "Porcentaje de Vapor de Agua: " + this.getPorcentajeVaporAgua(); 
	}

}
