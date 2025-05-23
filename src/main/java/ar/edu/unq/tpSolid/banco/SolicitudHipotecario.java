package ar.edu.unq.tpSolid.banco;

public class SolicitudHipotecario extends SolicitudDeCreditos {

    private double montoSolicitado;
    private int plazoEnMeses;
    private Cliente cliente;
    private Propiedad propiedad;

    public SolicitudHipotecario(int montoSolicitado, int plazoEnMeses, Cliente cliente, Propiedad propiedad) {
        super(montoSolicitado, plazoEnMeses, cliente);
        this.propiedad = propiedad;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    @Override
    public boolean esAceptable() {
        return (this.ingresoEsMayorA()
        && (this.getMontoSolicitado()<= this.getPropiedad().getValorFiscal()*0.7)
        && (this.edadAlTerminarElPlazo() <= 65));
    }

    @Override
    protected boolean ingresoEsMayorA() {
        return (this.getCliente().getSueldoNetoMensual()*0.5 >= this.cuotaMensual());
    }

    private int edadAlTerminarElPlazo() {
        return this.getCliente().getEdad() + plazoEnAños();
    }

    private int plazoEnAños() {
        return this.getPlazoEnMeses() / 12;
    }
}
