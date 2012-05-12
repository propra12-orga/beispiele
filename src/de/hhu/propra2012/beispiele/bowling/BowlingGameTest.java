package de.hhu.propra2012.beispiele.bowling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
	private Game g;
	
	@Before
	public void setUp() {
		g = new Game();
	}

	@Test
	public void testGutterGame() {
		rollN(20, 0);
		assertEquals(0, g.score());
	}
	
	@Test
	public void testAllOnes() {
		rollN(20, 1);
		assertEquals(20, g.score());
	}
	
	private void rollN(int n, int pins) {
		for (int i = 0; i < n; i++) g.roll(pins);
	}
}
