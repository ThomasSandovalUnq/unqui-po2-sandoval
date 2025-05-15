package ar.edu.unq.tp5.ej1;

public class Servicio implements Facturable {
    private double costoFijo;
    private int unidadesConsumidas;

    public Servicio(double costoFijo, int unidadesConsumidas) {
        costoFijo = costoFijo;
        unidadesConsumidas = unidadesConsumidas;
    }

    public double getCostoFijo() {
        return costoFijo;
    }

    public int getUnidadesConsumidas() {
        return unidadesConsumidas;
    }

    public double getMontoACobrar() {
        return costoFijo * unidadesConsumidas;
    }
}
