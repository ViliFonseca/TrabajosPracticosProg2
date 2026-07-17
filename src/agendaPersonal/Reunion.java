package agendaPersonal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reunion {
private Usuario[] participantes;
private LocalDate fecha;
private LocalTime horarioInicio;
private LocalTime horarioFin;
private String tema;
private String ubicacion;

public Reunion(int cantidadParticipantes) {
    this.participantes = new Usuario[cantidadParticipantes];
    this.fecha = LocalDate.of(0, 0, 0);
    this.horarioInicio = LocalTime.of(0, 0, 0);
    this.horarioFin = LocalTime.of(0, 0, 0);
}

public Reunion(Usuario[] participantes, LocalDate fecha, LocalTime horarioInicio, LocalTime horarioFin, String tema, String ubicacion) {
	super();
	this.participantes = participantes;
	this.fecha = fecha;
	this.horarioInicio = horarioInicio;
	this.horarioFin = horarioFin;
	this.tema = tema;
	this.ubicacion = ubicacion;
}
public Usuario[] getParticipantes() {
	return participantes;
}
public LocalDate getFecha() {
	return fecha;
}
public LocalTime getHorarioInicio() {
	return horarioInicio;
}
public LocalTime getHorarioFin() {
	return horarioFin;
}
public String getTema() {
	return tema;
}
public String getUbicacion() {
	return ubicacion;
}
}