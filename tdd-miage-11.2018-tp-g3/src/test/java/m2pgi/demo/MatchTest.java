package m2pgi.demo;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class MatchTest {

	private Match match;

	@Before
	public void setup() {
		match = new Match();
	}

	@Test
	public void testScoreNul() {
		String score = match.getScore(0, 0);
		Assertions.assertThat(score).isEqualTo("Score nul");
	}

	@Test
	public void testScore_1_0() {
		String score = match.getScore(1, 0);
		Assertions.assertThat(score).isEqualTo("15-0");
	}

	@Test
	public void testScore_2_0() {
		String score = match.getScore(2, 0);
		Assertions.assertThat(score).isEqualTo("30-0");
	}

	@Test
	public void testScore_1_1() {
		String score = match.getScore(1, 1);
		Assertions.assertThat(score).isEqualTo("15A");
	}

	@Test
	public void testScore_0_1() {
		String score = match.getScore(0, 1);
		Assertions.assertThat(score).isEqualTo("0-15");
	}

	@Test
	public void testScore_2_2() {
		String score = match.getScore(2, 2);
		Assertions.assertThat(score).isEqualTo("30A");
	}

	@Test
	public void testScore_1_3() {
		String score = match.getScore(1, 3);
		Assertions.assertThat(score).isEqualTo("15-40");
	}

	@Test
	public void testScore_4_2() {
		String score = match.getScore(4, 2);
		Assertions.assertThat(score).isEqualTo("J1 gagne");
	}

	@Test
	public void testScore_4_3() {
		String score = match.getScore(4, 3);
		Assertions.assertThat(score).isEqualTo("Avantage J1");
	}

	@Test
	public void testScore_4_4() {
		String score = match.getScore(4, 4);
		Assertions.assertThat(score).isEqualTo("Egalité");
	}

	@Test
	public void testScore_3_4() {
		String score = match.getScore(3, 4);
		Assertions.assertThat(score).isEqualTo("Avantage J2");
	}

	@Test
	public void testScore_6_6() {
		String score = match.getScore(6, 6);
		Assertions.assertThat(score).isEqualTo("Egalité");
	}
}
