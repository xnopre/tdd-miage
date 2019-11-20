package m2pgi.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreFormaterTest {
    ScoreFormater scoreFormater = new ScoreFormater();

    @Test
    public void should_return_score_nul() {
        String score = scoreFormater.format(0, 0);
        assertThat(score).isEqualTo("Score Nul");
    }

    @Test
    public void should_return_score_15_0() {
        String score = scoreFormater.format(1, 0);
        assertThat(score).isEqualTo("15-0");
    }

    @Test
    public void should_return_score_30_0() {
        String score = scoreFormater.format(2, 0);
        assertThat(score).isEqualTo("30-0");
    }

    @Test
    public void should_return_score_0_15() {
        String score = scoreFormater.format(0, 1);
        assertThat(score).isEqualTo("0-15");
    }

    @Test
    public void should_return_score_15A() {
        String score = scoreFormater.format(1, 1);
        assertThat(score).isEqualTo("15A");
    }

    @Test
    public void should_return_score_40_15() {
        String score = scoreFormater.format(3, 1);
        assertThat(score).isEqualTo("40-15");
    }

    @Test
    public void should_return_score_JeuJ1() {
        String score = scoreFormater.format(4, 2);
        assertThat(score).isEqualTo("Jeu J1");
    }

    @Test
    public void should_return_score_JeuJ2() {
        String score = scoreFormater.format(1, 4);
        assertThat(score).isEqualTo("Jeu J2");
    }

    @Test
    public void should_return_score_avantage_J1() {
        String score = scoreFormater.format(4, 3);
        assertThat(score).isEqualTo("Avantage J1");
    }

    @Test
    public void should_return_score_8_6() {
        String score = scoreFormater.format(8, 6);
        assertThat(score).isEqualTo("Jeu J1");
    }

    @Test
    public void should_return_score_4_4() {
        String score = scoreFormater.format(4, 4);
        assertThat(score).isEqualTo("Egalite");
    }
    @Test
    public void should_return_score_5_7() {
        String score = scoreFormater.format(5, 7);
        assertThat(score).isEqualTo("Jeu J2");
    }
    @Test
    public void should_return_score_7_7() {
        String score = scoreFormater.format(7, 7);
        assertThat(score).isEqualTo("Egalite");
    }
}
