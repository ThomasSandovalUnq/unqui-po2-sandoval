package ar.edu.unq.tpSolid.banco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    public void existeUnCliente() {
        Cliente cliente;
        cliente = new Cliente("Pepe", "Marmol", "Neuquen 1251", 32, 12500);
        assertEquals("Pepe", cliente.getNombre());
    }

    @Test
    public void unClienteConSueldoDe60000() {
        Cliente cliente;
        cliente = new Cliente("Ren", "Amamiya", "Japon 1452", 16, 60000);
        assertEquals(60000, cliente.getSueldoNetoMensual());
    }

    @Test
    public void unClienteConSueldoAnualDe150000() {
        Cliente cliente;
        cliente = new Cliente("Pepe", "Marmol", "Neuquen 1251", 32, 12500);
        assertEquals(150000, cliente.sueldoAnual());
    }
}