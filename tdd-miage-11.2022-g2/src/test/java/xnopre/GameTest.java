package xnopre;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    Game game = new Game("Bob", "John");

    @Test
    public void should_have_score_null() {

        String score = game.getScore(0, 0);

        assertThat(score).isEqualTo("Score Nul");
    }

    @Test
    public void should_have_score_15_0() {

        String score = game.getScore(1, 0);

        assertThat(score).isEqualTo("15-0");
    }

    @Test
    public void should_have_score_30_0() {

        String score = game.getScore(2, 0);

        assertThat(score).isEqualTo("30-0");
    }

    @Test
    public void should_have_score_0_15() {

        String score = game.getScore(0, 1);

        assertThat(score).isEqualTo("0-15");
    }

    @Test
    public void should_have_score_0_30() {

        String score = game.getScore(0, 2);

        assertThat(score).isEqualTo("0-30");
    }

    @Test
    public void should_have_score_15A() {

        String score = game.getScore(1, 1);

        assertThat(score).isEqualTo("15A");
    }

    @Test
    public void should_have_score_30A() {

        String score = game.getScore(2, 2);

        assertThat(score).isEqualTo("30A");
    }

    @Test
    public void should_have_score_40_15() {

        String score = game.getScore(3, 1);

        assertThat(score).isEqualTo("40-15");
    }

    @Test
    public void should_have_avantage_bob() {

        String score = game.getScore(4, 3);

        assertThat(score).isEqualTo("Avantage Bob");
    }

    @Test
    public void should_have_avantage_John() {

        String score = game.getScore(5, 6);

        assertThat(score).isEqualTo("Avantage John");
    }

    @Test
    public void should_have_jeu_bob() {

        String score = game.getScore(4, 2);

        assertThat(score).isEqualTo("Jeu Bob");
    }


}
