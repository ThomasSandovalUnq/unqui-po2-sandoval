package ar.edu.unq.tp5.ej1;

import java.util.ArrayList;

public class AgenciaDePago {
    private String nombre;
    private ArrayList<Factura> facturas;

    public AgenciaDePago(String nombre, ArrayList<Factura> facturas) {
        this.nombre = nombre;
        this.facturas = facturas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void registrarPago(Factura f) {
        facturas.add(f);
    }
}
