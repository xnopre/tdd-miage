package m2pgi.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatchTest {

    Match match = new Match();

    @Test
    public void should_match_0_0() {
        String result = match.getScore(0, 0);
        assertThat(result).isEqualTo("Score nul");
    }

    @Test
    public void should_match_1_0() {
        String result = match.getScore(1, 0);
        assertThat(result).isEqualTo("15-0");
    }

    @Test
    public void should_match_2_0() {
        String result = match.getScore(2, 0);
        assertThat(result).isEqualTo("30-0");
    }

    @Test
    public void should_match_0_1() {
        String result = match.getScore(0, 1);
        assertThat(result).isEqualTo("0-15");
    }

    @Test
    public void should_match_1_1() {
        String result = match.getScore(1, 1);
        assertThat(result).isEqualTo("15A");
    }

    @Test
    public void should_match_2_2() {
        String result = match.getScore(2, 2);
        assertThat(result).isEqualTo("30A");
    }

    @Test
    public void should_match_3_3() {
        String result = match.getScore(3, 3);
        assertThat(result).isEqualTo("40A");
    }

    @Test
    public void should_match_4_4() {
        String result = match.getScore(4, 4);
        assertThat(result).isEqualTo("Egalité");
    }

    @Test
    public void should_match_4_3() {
        String result = match.getScore(4, 3);
        assertThat(result).isEqualTo("Avantage A");
    }

    @Test
    public void should_match_6_5() {
        String result = match.getScore(6, 5);
        assertThat(result).isEqualTo("Avantage A");
    }


}
