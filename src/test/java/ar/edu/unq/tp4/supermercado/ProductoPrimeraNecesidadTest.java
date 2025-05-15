package ar.edu.unq.tp4.supermercado;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;

	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
	}
}
