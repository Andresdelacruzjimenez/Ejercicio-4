
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibroTest {

	Libro ejemplo = new Libro("Crimen y Castigo", "Dostoievsky", "Novela", 10);

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetCantidad() {

		assertEquals(10, ejemplo.getCantidad());

	}

	@Test
	void testSetCantidad() {
		Libro ejemplo2 = new Libro("Crimen", "Dostoievsky", "Novela", 11);
		assertEquals(11, ejemplo2.getCantidad());
	}

	@Test
	void testGetTitulo() {

		assertEquals("Crimen y Castigo", ejemplo.getTitulo());
	}

	@Test
	void testSetTitulo() {
		
		Libro ejemplo2 = new Libro("Crimen", "Dostoievsky", "Novela", 10);
		assertEquals("Crimen", ejemplo2.getTitulo());
	}

	@Test
	void testGetAutor() {

		assertEquals("Dostoievsky", ejemplo.getAutor());
	}

	@Test
	void testSetAutor() {
		Libro ejemplo2 = new Libro("Crimen", "Dostoievsky", "Novela", 10);
		assertEquals("Dostoievsky", ejemplo2.getAutor());
	}

	@Test
	void testGetTipo() {

		assertEquals("Novela", ejemplo.getTipo());
	}

	@Test
	void testSetTipo() {
		Libro ejemplo2 = new Libro("Crimen", "Dostoievsky", "Novela", 10);
		assertEquals("Novela", ejemplo2.getTipo());
	}

	@Test
	void testPrestamo() {
		assertEquals(9, ejemplo.prestamo(1));

	}

	@Test
	void testDevolucion() {
		assertEquals(11, ejemplo.devolucion(1));
	}

	@Test
	void testToString() {
		assertEquals("Crimen y Castigo de Dostoievsky, Novela, disponibles: 10", ejemplo.toString());
	}

}
