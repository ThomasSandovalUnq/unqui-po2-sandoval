package ar.edu.unq.tp5.ej1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AgenciaTest {

    @Test
    public void testExisteUnaAgenciaDePago() {
        ArrayList<Factura> sinFacturas = new ArrayList<Factura>();
        AgenciaDePago adp = new AgenciaDePago("Mercado Libre", sinFacturas);
        assertEquals("Mercado Libre", adp.getNombre());
    }

    @Test
    public void testUnaAgenciaTieneFacturas() {
        Servicio luz = new Servicio(200, 100);
        ArrayList<Factura> facturas = new ArrayList<Factura>();
        AgenciaDePago adp = new AgenciaDePago("Mercado Libre", facturas);
        assertEquals(0, adp.getFacturas().size());
    }
}