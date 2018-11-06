package m2pgi.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorTest {

	private final Calculator calculator = new Calculator();

	@Test
	public void resultat_match_nul() {

		String score = calculator.calculate(0, 0);

		Assertions.assertThat(score).isEqualTo("Score Nul");

	}

	@Test
	public void resultat_match_1_0() {

		String score = calculator.calculate(1, 0);

		Assertions.assertThat(score).isEqualTo("15-0");

	}

	@Test
	public void resultat_match_2_0() {

		String score = calculator.calculate(2, 0);

		Assertions.assertThat(score).isEqualTo("30-0");

	}

	@Test
	public void resultat_match_1_1() {

		String score = calculator.calculate(1, 1);

		Assertions.assertThat(score).isEqualTo("15A");

	}

	@Test
	public void resultat_match_0_1() {

		String score = calculator.calculate(0, 1);

		Assertions.assertThat(score).isEqualTo("0-15");

	}

	@Test
	public void resultat_match_1_3() {

		String score = calculator.calculate(1, 3);

		Assertions.assertThat(score).isEqualTo("15-40");

	}

	@Test
	public void resultat_match_4_2() {

		String score = calculator.calculate(4, 2);

		Assertions.assertThat(score).isEqualTo("J1 gagne");

	}

	@Test
	public void resultat_match_4_3() {

		String score = calculator.calculate(4, 3);

		Assertions.assertThat(score).isEqualTo("Avantage J1");

	}

	@Test
	public void resultat_match_4_1() {

		String score = calculator.calculate(4, 1);

		Assertions.assertThat(score).isEqualTo("J1 gagne");

	}

	@Test
	public void resultat_match_3_4() {

		String score = calculator.calculate(3, 4);

		Assertions.assertThat(score).isEqualTo("Avantage J2");

	}

	@Test
	public void resultat_match_9_8() {

		String score = calculator.calculate(9, 8);

		Assertions.assertThat(score).isEqualTo("Avantage J1");

	}

	@Test
	public void resultat_match_10_8() {

		String score = calculator.calculate(10, 8);

		Assertions.assertThat(score).isEqualTo("J1 gagne");

	}
}
