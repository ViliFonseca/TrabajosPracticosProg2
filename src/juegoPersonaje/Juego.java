package juegoPersonaje;

public class Juego {
private Personaje personaje1;
private Personaje personaje2;
private String[] criterios;


public Juego(Personaje personaje1, Personaje personaje2, String[] criterios) {
	this.personaje1 = personaje1;
	this.personaje2 = personaje2;
	this.criterios = criterios;
}
public	Personaje enfrentar() {
	for(String criterio : criterios) {
	int nivel1 = personaje1.getCualidades(criterio);
	int nivel2 = personaje2.getCualidades(criterio);
	
	if (nivel1 < nivel2) {
		return personaje1;
	}else if(nivel1 > nivel2) {
		return personaje2;
	}
	}
	return desempatar();
}

private Personaje desempatar() {
    String criterioAleatorio = personaje1.getCualidadAleatoria();
    System.out.println("Desempate con el criterio: " + criterioAleatorio);

    int nivel1 = personaje1.getCualidades(criterioAleatorio);
    int nivel2 = personaje2.getCualidades(criterioAleatorio);

    if (nivel1 > nivel2) {
        return personaje1;
    } else if (nivel2 > nivel1) {
        return personaje2;
    }

    // Si aún hay empate, se puede seguir eligiendo otro criterio o decidir por otra regla.
    return personaje1;  // O algún otro método de desempate adicional
}
}

