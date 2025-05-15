package ar.edu.unq.tp5.ej1;

public abstract class Producto implements Facturable {
    protected String nombre;
    protected double precioBase;
    protected int stock;

    public Producto(String nombre, double precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public double registrarVenta() {
        if (stock <= 0) throw new RuntimeException("Sin stock");
        stock--;
        return getPrecioVenta();
    }

    public abstract double getPrecioVenta();

    public double getMontoTotal() {
        return getPrecioVenta();
    }
}
