package junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Testklasse für Methoden der Klasse Taschenrechner.
 */
public class TaschenrechnerTest extends TestCase {
	
	/** Der Taschenrechner, der getestet wird. */
	private Taschenrechner taschenrechner;
	
	/**
	 * Erzeugt ein Objekt dieser Klasse mit angegebenem Namen.
	 * @param name Name des Tests.
	 */
	public TaschenrechnerTest(String name) {
		
		super(name);
	}
	
	/**
	 * Liefert die Suite der Testmethoden
	 * @return Testmethoden dieser Klasse
	 */
	public static Test suite() {
	    
	    return new TestSuite(TaschenrechnerTest.class);
	}
	
	/**
	 * Testdaten aufbauen
	 */
	protected void setUp() {
		
		taschenrechner = new Taschenrechner();
	}
	
	/**
	 * Testet die Methode addiere der Klasse Taschenrechner.
	 */
	public void testAddiere() {
		
		assertEquals(3 + 4, taschenrechner.addiere(3, 3));
		assertEquals(-1 + -1, taschenrechner.addiere(-1, -1));
	}
	
	/**
	 * Testet die Methode multipliziere der Klasse Taschenrechner.
	 */
	public void testMultipliziere() {
		
		assertEquals(3 * 4, taschenrechner.multipliziere(3, 4));
		assertEquals(-1 * -1, taschenrechner.multipliziere(-1, -1));
	}
	
	/**
	 * Startet den Test
	 * @param args Wird nicht verwendet
	 */
	public static void main(String[] args) {
	    
	    /* textueller TestRunner */
	    junit.textui.TestRunner.run(suite());
	    
	    /* grafischer TestRunner */
//	    junit.swingui.TestRunner.run(TaschenrechnerTest.class);
	  }

}
