package ar.edu.unq.tp5.ej1;

public class ProductoTradicional extends Producto {
    public ProductoTradicional(String nombre, double precioBase, int stock) {
        super(nombre, precioBase, stock);
    }

    @Override
    public double getPrecioVenta() {
        return precioBase;
    }

    @Override
    public double getMontoACobrar() {
        return getMontoTotal();
    }
}