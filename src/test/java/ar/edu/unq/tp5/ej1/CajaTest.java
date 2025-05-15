package ar.edu.unq.tp5.ej1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CajaTest {

    private Caja c;
    private ProductoTradicional pt;
    private ProductoDeCoperativa pdc;

    @BeforeEach
    void setUp() {
        c = new Caja();
        pt = new ProductoTradicional("Arroz", 1500, 50);
        pdc = new ProductoDeCoperativa("Aceite de Girasol", 3000, 5);
    }

    @Test
    public void testCaja() {
        assertEquals(0, c.getMontoTotal());
        c.registrarProducto(pt);
        c.registrarProducto(pdc);
        assertEquals(4200, c.getMontoTotal());
    }
}