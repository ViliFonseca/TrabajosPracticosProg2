package series;

public class Main {

	public static void main(String[] args) {
		 Capitulo cap1 = new Capitulo(4.2, "Capítulo 1", "Descripción del capítulo 1", true);
	        Capitulo cap2 = new Capitulo(2.2,"Capítulo 2", "Descripción del capítulo 2", true);
	        Capitulo cap3 = new Capitulo(3.5,"Capítulo3 " ,  "Descripción del capítulo 2", true);
	        
	        
	        Capitulo cap4 = new Capitulo(4.2, "Capítulo 1", "Descripción del capítulo 1", false);
	        Capitulo cap5 = new Capitulo(2.2,"Capítulo 2", "Descripción del capítulo 2", false);
	        Capitulo cap6 = new Capitulo(3.5,"Capítulo3 " ,  "Descripción del capítulo 2", true);
	        
	        Capitulo[] capitulostemp1 = {cap1, cap2,cap3} ;
	        Capitulo[] capitulostemp2 = {cap4, cap5, cap6};
	        Temporada temporada1 = new Temporada(1, capitulostemp1);
	        Temporada temporada2 = new Temporada(2, capitulostemp2);
	        Temporada[] temporadasnaruto = {temporada1,temporada2};
	        System.out.println(temporada2.seVieronTodosLosEpisodios());
	        String[] generos = {"Anime", "Gay"};
	        Serie naruto = new Serie("Naruto","chico rubio", "un ponja",generos,temporadasnaruto);
	        System.out.println(naruto.todosCapsVistos());		
	        cap4.setVisto(true);
	        cap5.setVisto(true);
	        System.out.println(naruto.cantidadCapitulosVistos());		
	        System.out.println(naruto.getCalificacion());	
	}

}
