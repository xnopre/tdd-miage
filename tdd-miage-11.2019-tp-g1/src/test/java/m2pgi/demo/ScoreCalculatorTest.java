package m2pgi.demo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreCalculatorTest {

    ScoreCalculator scoreCalculator = new ScoreCalculator();

    @Test
    public void scoreNul(){
        String score = scoreCalculator.calculateScore(0,0);
        assertThat(score).isEqualTo("Score Nul");
    }

    @Test
    public void scoreUnZero(){
        String score = scoreCalculator.calculateScore(1,0);
        assertThat(score).isEqualTo("15-0");
    }

    @Test
    public void scoreDeuxZero(){
        String score = scoreCalculator.calculateScore(2,0);
        assertThat(score).isEqualTo("30-0");
    }

    @Test
    public void scoreZeroUn(){
        String score = scoreCalculator.calculateScore(0,1);
        assertThat(score).isEqualTo("0-15");
    }

    @Test
    public void scoreUnUn(){
        String score = scoreCalculator.calculateScore(1,1);
        assertThat(score).isEqualTo("15A");
    }

    @Test
    public void scoreDeuxDeux(){
        String score = scoreCalculator.calculateScore(2,2);
        assertThat(score).isEqualTo("30A");
    }

    @Test
    public void scoreTroisUn(){
        String score = scoreCalculator.calculateScore(3,1);
        assertThat(score).isEqualTo("40-15");
    }

    @Test
    public void scoreTroisDeux(){
        String score = scoreCalculator.calculateScore(3,2);
        assertThat(score).isEqualTo("40-30");
    }



}
