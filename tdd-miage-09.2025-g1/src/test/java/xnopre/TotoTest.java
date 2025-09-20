package xnopre;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TotoTest {


    @Test
    public void ShouldReturnScoreNulWhenNul() {
        assertThat(ScoreHandler.getScore(0, 0)).isEqualTo("Score Nul");
    }

    @Test
    public void ShouldReturnScoreWhenOneZero() {
        assertThat(ScoreHandler.getScore(1,0)).isEqualTo("15-0");
    }

    @Test
    public void ShouldReturnScoreWhenTwoZero(){
        assertThat(ScoreHandler.getScore(2,0)).isEqualTo("30-0");
    }

    @Test
    public void ShouldReturnScoreWhenZeroOne(){
        assertThat(ScoreHandler.getScore(0,1)).isEqualTo("0-15");
    }
    @Test
    public void ShouldReturnScoreWhenOneTwo(){
        assertThat(ScoreHandler.getScore(1,2)).isEqualTo("15-30");
    }
    @Test
    public void ShouldReturnScoreWhenOneOne(){
        assertThat(ScoreHandler.getScore(1,1)).isEqualTo("15A");
    }

    @Test
    public void ShouldReturnScoreWhenTwoTwo(){
        assertThat(ScoreHandler.getScore(2,2)).isEqualTo("30A");
    }

    @Test
    public void ShouldReturnScoreWhenTreeOne(){
        assertThat(ScoreHandler.getScore(3,1)).isEqualTo("40-15");
    }
}
