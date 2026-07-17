package farmacia;

public class Principal {
	public static void main(String[] args) {
		Farmacia f1 = new Farmacia();
		
		Medicamento buscapina = new Medicamento("Buscapina", "Bayer", 1500, "Iocina");
		buscapina.agregarSintoma("dolor de panza");
		buscapina.agregarSintoma("dolor abdominal");
		
		Medicamento ibuprofeno = new Medicamento("Ibupirac", "Pfizer", 2500, "Ibuprofeno");
		ibuprofeno.agregarSintoma("fiebre");
		
		f1.agregarMedicamento(buscapina);
		f1.agregarMedicamento(ibuprofeno);
		// Version mal 
		//System.out.println(f1.buscarMedicamentoPorPrecioMenos(1400));
		
		// Lo mismo, usando Condicion
		// Busqueda por precio, usando condición
		Condicion cond1 = new CondicionPorPrecio(1600);
		System.out.println(f1.buscarMedicamentos(cond1)); // Imprime correctamente pq ArrayList implementa toString y Medicamento tambien
		
		// Busqueda por nombre
		Condicion cond2 = new CondicionPorNombre("Ibu");
		System.out.println(f1.buscarMedicamentos(cond2));
		
		// Busqueda por nombre y precio
		Condicion condAnd = new CondicionAnd(cond1, cond2);
		System.out.println(f1.buscarMedicamentos(condAnd));
		
		// Busqueda por nombre o precio
		Condicion condOr = new CondicionOr(cond1, cond2);
		System.out.println(f1.buscarMedicamentos(condOr));
		
		// Busqueda por nombre y lab y precio
		System.out.println(f1.buscarMedicamentos(
				new CondicionAnd(
						new CondicionAnd(new CondicionPorNombre("ac"), new CondicionPorLab("Pfizer")),
						new CondicionPorPrecio(2600))));
		
		// Busqueda por not precio (mayor o igual)
		System.out.println(f1.buscarMedicamentos(new CondicionNot(cond1)));
	}
}
