package ar.edu.unq.tp4.ingreso;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
    private List<Ingreso> ingresos;

    public Trabajador() {
        ingresos = new ArrayList<>();
    }

    public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }

    public double getTotalPercibido() {
        double total = 0;
        for (Ingreso ingreso : ingresos) {
            total += ingreso.getMontoPercibido();
        }
        return total;
    }

    public double getTotalImponible() {
        double total = 0;
        for (Ingreso ingreso : ingresos) {
            total += ingreso.getMontoImponible();
        }
        return total;
    }

    public double getImpuestoAPagar(){
        return getTotalImponible() * 0.02;
    }
}