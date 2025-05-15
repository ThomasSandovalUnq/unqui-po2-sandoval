package ar.edu.unq.tp5.ej1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CajaTest2 {
    private Caja caja;
    private ProductoTradicional arroz;
    private ProductoDeCoperativa azucar;
    private Servicio luz;

    @BeforeEach
    void setUp() {
        caja = new Caja();
        arroz = new ProductoTradicional("Arroz", 50.0, 10);
        azucar = new ProductoDeCoperativa("Azucar", 40.0, 5);
        luz = new Servicio(200.0, 100);
        }

    @Test
    void testCajaRegistersProductsCorrectly() {
        caja.registrarProducto(arroz);
        assertEquals(50.0, caja.getMontoTotal(), 0.001); // Using delta for double comparison
        caja.registrarProducto(azucar);
        assertEquals(50.0 + (40.0 * 0.9), caja.getMontoTotal());
    }

    @Test
    void testCajaRegistersServicesCorrectly() {
        caja.registrarProducto(luz);
        assertEquals(200.0, caja.getMontoTotal());
    }

    @Test
    void testCajaRegistersMixedItemsCorrectly() {
        caja.registrarProducto(arroz); // 50.0
        caja.registrarProducto(luz);   // 200.0
        caja.registrarProducto(azucar); // 40.0 * 0.9 = 36.0

        double expectedTotal = 50.0 + 200.0 + 150.0 + 36.0;
        assertEquals(expectedTotal, caja.getMontoTotal());
    }
}
