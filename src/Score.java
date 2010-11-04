public class Score {

	public static final Score ZERO = new Score(0);

	private int score;

	public Score(int score) {
		this.score = score;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Score)) {
			return false;
		}
		Score other = (Score) obj;
		return other.isScore(this.score);
	}

	private boolean isScore(int otherScore) {
		return score == otherScore;
	}

	@Override
	public String toString() {
		return "" + score;
	}
}
