package lluviameses;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LluviamesesTest {

	private static Lluviameses lluviames;

	@BeforeClass
	public static void testLluviameses() {
		lluviames = new Lluviameses();
	}

	@Before
	public void testVariables() {
		lluviames.registrarlluviames(0, 20);
		lluviames.registrarlluviames(1, 20);
		lluviames.registrarlluviames(2, 20);
		lluviames.registrarlluviames(3, 20);
		lluviames.registrarlluviames(4, 20);
		lluviames.registrarlluviames(5, 20);
		lluviames.registrarlluviames(6, 20);
		lluviames.registrarlluviames(7, 20);
		lluviames.registrarlluviames(8, 20);
		lluviames.registrarlluviames(9, 20);
		lluviames.registrarlluviames(10, 20);
		lluviames.registrarlluviames(11, 25);
	}

	@Test
	public void testRegistrarlluviames() {
		try {
			lluviames.registrarlluviames(13, 200);
		} catch (Error e) {
			System.out.println("No hay trece meses en un año");
		}
	}

	@Test
	public void testConsultarlluviames() {
		int LluviaEnero = lluviames.consultarlluviames(1);
		assertEquals(20, LluviaEnero);
	}

	@Test
	public void testSumarcantidadlluvia() {
		int cantidadDeLluvia = lluviames.sumarcantidadlluvia();
		assertEquals(245, cantidadDeLluvia);
	}

	@Test
	public void testConsultarCuatrimestreMasLluvioso() {
		int mesMasLLuvioso = lluviames.consultarCuatrimestreMasLluvioso();
		assertEquals(2, mesMasLLuvioso);
	}

}
