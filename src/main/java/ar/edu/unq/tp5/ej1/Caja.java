package ar.edu.unq.tp5.ej1;

public class Caja {
    private double montoTotal;

    public Caja() {
        montoTotal = 0;
    }

    public void registrarProducto (Facturable f) {
        montoTotal += f.getMontoACobrar();
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void reiniciar() {
        montoTotal = 0;
    }
}
