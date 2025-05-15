package ar.edu.unq.tp5.ej1;

public class Factura {
    private double monto;
    private String tipo;

    public Factura(double monto, String tipo) {
        this.monto = monto;
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }
}