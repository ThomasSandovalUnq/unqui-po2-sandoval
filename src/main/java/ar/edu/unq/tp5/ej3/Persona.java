package ar.edu.unq.tp5.ej3;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable {
    private String nombre;
    private LocalDate fecha;

    public Persona(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int edad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaActual, LocalDate.now());
        return periodo.getYears();
    }

    public boolean esMenorQue(Persona persona) {
        return this.edad() < persona.edad();
    }
}
