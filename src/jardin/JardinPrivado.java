package jardin;

public class JardinPrivado {

	public static void main(String[] args) {
		Planta bonsai = new Planta("Bonsai", "Bonsaisikmdaos", "Japon", null);
		System.out.println(bonsai.getIdentificador());
		Planta arbol = new Planta("Arbol", "Arboleusmolestus", "Argentina", null);
		System.out.println(arbol.getIdentificador());
	}

}
