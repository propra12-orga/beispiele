package de.hhu.propra2012.beispiele.bowling;

public class Game {
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}
	
	public int score() {
		int score = 0, frameIndex = 0;
		for (int frame = 0; frame < rolls.length/2; frame++) {
			score += scoreInFrame(frameIndex);
			frameIndex += 2;
		}
		return score;
	}

	private int scoreInFrame(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex+1];
	}
}
