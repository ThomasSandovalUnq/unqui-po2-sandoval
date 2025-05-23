package ar.edu.unq.tpSolid.banco;

public abstract class SolicitudDeCreditos {

    protected double montoSolicitado;
    protected int plazoEnMeses;
    protected Cliente cliente;

    public Cliente getCliente(){
        return this.cliente;
    }

    public String getNombreCliente(){
        return this.cliente.getNombre();
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public SolicitudDeCreditos(int montoSolicitado, int plazoEnMeses, Cliente cliente) {
        this.montoSolicitado = montoSolicitado;
        this.plazoEnMeses = plazoEnMeses;
        this.cliente = cliente;
    }

    public double cuotaMensual(){
        return getMontoSolicitado()/ getPlazoEnMeses();
    }

    public abstract boolean esAceptable();

    protected abstract boolean ingresoEsMayorA();
}
