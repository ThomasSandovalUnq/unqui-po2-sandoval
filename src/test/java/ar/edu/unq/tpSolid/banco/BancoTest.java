package ar.edu.unq.tpSolid.banco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    private Banco banco;
    private SolicitudHipotecario sh;
    private SolicitudPersonal sh2;
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        this.banco = new Banco();
        Propiedad prop;
        prop = new Propiedad("japon, ciudad", "Lee blanc", 1500000);
        this.cliente = new Cliente("Ren", "Amamiya", "Japon 1452", 18, 150000);
        this.sh = new SolicitudHipotecario(120000, 5, cliente, prop);
        this.sh2 = new SolicitudPersonal(1200000000, 5, cliente);
    }

    @Test
    void bancoVacio(){
        assertTrue(this.banco.getClientes().isEmpty());
    }

    @Test
    void bancoConClienteYSolicitudDeCreditos(){
        this.banco.agregarCliente(cliente);
        this.banco.agregarSolicitudDeCredito(sh);
        assertTrue(this.banco.getClientes().contains(cliente));
        assertTrue(this.banco.getSolcs().contains(sh));
    }

    @Test
    void bancoConMontoADesembolsar(){
        this.banco.agregarCliente(cliente);
        this.banco.agregarSolicitudDeCredito(sh);
        this.banco.agregarSolicitudDeCredito(sh2);
        assertEquals(120000 ,this.banco.montoADesembolsar());
    }
}