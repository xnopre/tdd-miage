package m2pgi.demo;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ScoreTest {

	private Score score;

	@Before
	public void initScore() {
		score = new Score();
	}

	@Test
	public void test_score_nul() {
		String resultat = score.marque(0, 0);
		Assertions.assertThat(resultat).isEqualTo("Score nul");
	}

	@Test
	public void test_score_un_zero() {
		String resultat = score.marque(1, 0);
		Assertions.assertThat(resultat).isEqualTo("15 - 0");
	}

	@Test
	public void test_score_deux_zero() {
		String resultat = score.marque(2, 0);
		Assertions.assertThat(resultat).isEqualTo("30 - 0");
	}

	@Test
	public void test_score_zero_un() {
		String resultat = score.marque(0, 1);
		Assertions.assertThat(resultat).isEqualTo("0 - 15");
	}

	@Test
	public void test_score_zero_deux() {
		String resultat = score.marque(0, 2);
		Assertions.assertThat(resultat).isEqualTo("0 - 30");
	}

	@Test
	public void test_score_un_un() {
		String resultat = score.marque(1, 1);
		Assertions.assertThat(resultat).isEqualTo("15A");
	}

	@Test
	public void test_score_deux_deux() {
		String resultat = score.marque(2, 2);
		Assertions.assertThat(resultat).isEqualTo("30A");
	}

	@Test
	public void test_score_trois_trois() {
		String resultat = score.marque(3, 3);
		Assertions.assertThat(resultat).isEqualTo("40A");
	}

	@Test
	public void test_score_quatre_deux() {
		String resultat = score.marque(4, 2);
		Assertions.assertThat(resultat).isEqualTo("J1 gagne");
	}

	@Test
	public void test_score_un_quatre() {
		String resultat = score.marque(1, 4);
		Assertions.assertThat(resultat).isEqualTo("J2 gagne");
	}

	@Test
	public void test_score_cinq_quatre() {
		String resultat = score.marque(5, 4);
		Assertions.assertThat(resultat).isEqualTo("Avantage J1");
	}
}
