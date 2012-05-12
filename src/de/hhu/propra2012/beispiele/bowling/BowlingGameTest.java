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
    
    @Test
    public void testOneSpare() {
        rollSpare();
        g.roll(3);
        rollN(17, 0);
        assertEquals(16, g.score());
    }
    
    @Test
    public void testOneStrike() {
        g.roll(10); // strike!!!
        g.roll(5);
        g.roll(4);
        rollN(16, 0);
        assertEquals(28, g.score());
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }
    private void rollN(int n, int pins) {
        for (int i = 0; i < n; i++) g.roll(pins);
    }
}
