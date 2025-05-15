package ar.edu.unq.tp5.ej1;

public class ProductoDeCoperativa extends Producto {
    public ProductoDeCoperativa(String nombre, double precioBase, int stock) {
        super(nombre, precioBase, stock);
    }

    @Override
    public double getPrecioVenta() {
        return precioBase * 0.9;
    }

    @Override
    public double getMontoACobrar() {
        return getMontoTotal();
    }
}
