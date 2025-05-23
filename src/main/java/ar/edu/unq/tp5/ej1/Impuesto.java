package ar.edu.unq.tp5.ej1;

public class Impuesto implements Facturable {
    private Agencia agencia;
    private double montoImpuesto; // Could be a fixed amount or calculated based on criteria

    public Impuesto(Agencia agencia, double montoImpuesto) {
        this.agencia = agencia;
        this.montoImpuesto = montoImpuesto;
    }

    public double getMontoACobrar() {
        // Before returning the amount, notify the agency
        agencia.registrarPago(new Factura(montoImpuesto));
        return montoImpuesto;
    }
}
