import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculScoreTest {
    CalculScore calcul = new CalculScore("Bob", "Dylan");

    @Test
    public void shouldTestGetScoreNul() {
        String testResult = calcul.getScore(0, 0);
        assertThat(testResult).isEqualTo("Score Nul");
    }

    @Test
    public void shouldTestGetScoreFifteenZero() {
        String testResult = calcul.getScore(1, 0);
        assertThat(testResult).isEqualTo("15-0");
    }

    @Test
    public void shouldTestGetScoreThirtyZero() {
        String testResult = calcul.getScore(2, 0);
        assertThat(testResult).isEqualTo("30-0");
    }

    @Test
    public void shouldTestGetScoreZeroFifteen() {
        String testResult = calcul.getScore(0, 1);
        assertThat(testResult).isEqualTo("0-15");
    }

    @Test
    public void shouldTestGetScoreFifteenFifteen() {
        String testResult = calcul.getScore(1, 1);
        assertThat(testResult).isEqualTo("15A");
    }

    @Test
    public void shouldTestGetScoreThirtyThirty() {
        String testResult = calcul.getScore(2, 2);
        assertThat(testResult).isEqualTo("30A");
    }

    @Test
    public void shouldTestGetScoreFortyFifteen() {
        String testResult = calcul.getScore(3, 1);
        assertThat(testResult).isEqualTo("40-15");
    }

    @Test
    public void shouldTestGetScoreJeuBob() {
        String testResult = calcul.getScore(4, 2);
        assertThat(testResult).isEqualTo("Jeu Bob");
    }
}
