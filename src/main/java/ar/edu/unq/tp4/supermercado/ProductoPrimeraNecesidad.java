package ar.edu.unq.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {

    private double porcentaje;

    public ProductoPrimeraNecesidad(String nombre, double precio, Boolean precioCuidado, double porcentaje) {
        super(nombre, precio, precioCuidado);
        this.porcentaje = porcentaje;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * (1 - (porcentaje / 100));
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
