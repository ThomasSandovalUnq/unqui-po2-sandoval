package ar.edu.unq.tpSolid.banco;

public class SolicitudPersonal extends SolicitudDeCreditos {

    private double montoSolicitado;
    private int plazoEnMeses;
    private Cliente cliente;

    public SolicitudPersonal(int montoSolicitado, int plazoEnMeses, Cliente cliente) {
        super(montoSolicitado, plazoEnMeses, cliente);
    }

    @Override
    public boolean esAceptable() {
        return (this.ingresoEsMayorA()
                && (this.cuotaMensual() <= this.getCliente().getSueldoNetoMensual()*0.7));
    }

    @Override
    protected boolean ingresoEsMayorA() {
        return (this.getCliente().sueldoAnual() >= 15000);
    }

}
