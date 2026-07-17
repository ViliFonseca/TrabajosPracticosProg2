package coleccionables;

public class Main {

	public static void main(String[] args) {
      Figura Wod = new Figura("Woody", "Vaquero", 10, 150);//105
      Figura Buzz = new Figura("Buzz Lightyear", "Astronauta", 01, 250);
      figuraLimitada TiroAB = new figuraLimitada("Tiro Al Blanco", "Animal", 01, 250, 100, 10);
      Figura Jessie = new Figura("Jessie", "Vaquero", 01, 250);

      Coleccion ToyStory = new Coleccion("Toy Story",0.5);
      ToyStory.añadirElemento(Buzz);
      Coleccion Vaquero = new Coleccion("Vaqueros",0.3);
      ToyStory.añadirElemento(Vaquero);
      Vaquero.añadirElemento(Wod);
      ToyStory.añadirElemento(TiroAB);      
      Vaquero.añadirElemento(Jessie);
    
     System.out.println(ToyStory.getPrecio());
	 
	}

}
