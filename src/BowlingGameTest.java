import static org.junit.Assert.*;

import org.junit.Test;



public class BowlingGameTest {

	@Test
	public void shouldHaveScoreOfZeroIfTHereWereAllZeroRolls() throws Exception {
		Score score = new BowlingGame().score();
		assertEquals(Score.ZERO, score);
	}
	
	@Test
	public void a_game_with_1_frame() throws Exception {
		BowlingGame game = new BowlingGame();
		game.roll(new Pins(1));
		game.roll(new Pins(2));
		assertEquals(new Score(3), game.score());
	}

}
