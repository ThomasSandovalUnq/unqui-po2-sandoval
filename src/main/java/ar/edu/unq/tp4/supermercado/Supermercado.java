package ar.edu.unq.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombreS;
    private String direccion;
    private List<Producto> productos;

    public Supermercado(String nombreS, String direccion) {
        this.nombreS = nombreS;
        this.direccion = direccion;
        this.productos = new ArrayList<Producto>();
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double getPrecioTotal() {
        double precio = 0;
        for (Producto producto : productos) {
            precio += producto.getPrecio();
        }
        return precio;
    }
}
