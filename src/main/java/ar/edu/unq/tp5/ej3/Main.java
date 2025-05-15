package ar.edu.unq.tp5.ej3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate two Personas
        Persona juan = new Persona("Juan", LocalDate.of(1990, 5, 15));
        Persona ana = new Persona("Ana", LocalDate.of(2000, 10, 20));

        // Instantiate two Mascotas
        Mascota firulais = new Mascota("Firulais", "Perro");
        Mascota michi = new Mascota("Michi", "Gato");

        // Create a collection of Nombrable objects
        List<Nombrable> objetosConNombre = new ArrayList<>();
        objetosConNombre.add(juan);
        objetosConNombre.add(ana);
        objetosConNombre.add(firulais);
        objetosConNombre.add(michi);

        for (Nombrable obj : objetosConNombre) {
            System.out.println(obj.getNombre());
        }

        System.out.println(juan.esMenorQue(ana));
    }
}