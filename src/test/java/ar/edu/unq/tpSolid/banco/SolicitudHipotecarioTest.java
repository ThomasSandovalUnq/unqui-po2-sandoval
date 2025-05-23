package ar.edu.unq.tpSolid.banco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitudHipotecarioTest {

    private SolicitudHipotecario sh;
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        Propiedad prop;
        prop = new Propiedad("japon, ciudad", "Lee blanc", 1500000);
        this.cliente = new Cliente("Ren", "Amamiya", "Japon 1452", 18, 150000);
        this.sh = new SolicitudHipotecario(120000, 5, cliente, prop);
    }

    @Test
    void nombreDelCliente() {
        assertEquals(this.cliente.getNombre(), sh.getNombreCliente());
    }

    @Test
    void ingresoEsMayorA() {
        assertTrue(sh.ingresoEsMayorA());
    }

    @Test
    void esAceptable() {
        assertTrue(sh.esAceptable());
    }
}