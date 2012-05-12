package de.hhu.propra2012.beispiele.bowling;

public class Game {
	private int score = 0;
	
	public void roll(int pins) {
		score += pins;
	}
	
	public int score() {
		return score;
	}
}
