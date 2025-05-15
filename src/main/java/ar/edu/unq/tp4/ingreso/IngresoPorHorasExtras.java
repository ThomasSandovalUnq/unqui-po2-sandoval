package ar.edu.unq.tp4.ingreso;

public class IngresoPorHorasExtras extends Ingreso {
    private int horasExtras;

    public IngresoPorHorasExtras(String mes, String concepto, double montoPercibido, int horasExtras) {
        super(mes, concepto, montoPercibido);
        this.horasExtras = horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return this.horasExtras;
    }

    @Override
    public double getMontoImponible() {
        return 0;
    }
}
