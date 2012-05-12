package de.hhu.propra2012.beispiele.taschenrechner;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Testklasse für Methoden der Klasse Taschenrechner.
 */
public class TaschenrechnerTest {

	/** Der Taschenrechner, der getestet wird. */
	private Taschenrechner taschenrechner;

	/**
	 * Testdaten aufbauen
	 */
	@Before
	public void setUp() {
		this.taschenrechner = new Taschenrechner();
	}

	/**
	 * Testet die Methode addiere der Klasse Taschenrechner.
	 */
	@Test
	public void testAddiere() {
		assertEquals(3 + 3, taschenrechner.addiere(3, 3));
		assertEquals(-1 + -1, taschenrechner.addiere(-1, -1));
	}

	/**
	 * Testet die Methode multipliziere der Klasse Taschenrechner.
	 */
	@Test
	public void testMultipliziere() {
		assertEquals(3 * 4, taschenrechner.multipliziere(3, 4));
		assertEquals(-1 * -1, taschenrechner.multipliziere(-1, -1));
	}

}
