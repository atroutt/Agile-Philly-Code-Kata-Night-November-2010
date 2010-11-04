public class BowlingGame {
	
	private Score score;
	private Frame frame = new Frame();
	
	public void roll(Pins pins) {
		frame.add(pins);
	}

	public Score score() {
		return new Score(0);
	}

}
