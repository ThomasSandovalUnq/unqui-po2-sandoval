package ar.edu.unq.tp4.supermercado;

public class Producto {
    private String nombre;
    private double precio;
    private Boolean precioCuidado;

    public Producto(String nombre, double precio, Boolean precioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = precioCuidado;
    }

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Boolean esPrecioCuidado() {
        return precioCuidado;
    }

    public void aumentarPrecio(double precioAAumentar) {
        precio = precio + precioAAumentar;
    }
}