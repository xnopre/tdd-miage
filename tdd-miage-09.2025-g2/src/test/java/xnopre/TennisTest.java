package xnopre;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {
    Partie partie = new Partie();

    @Test
    public void test_source_null(){
        String result = partie.renvoieScore(0,0);

        assertThat(result).isEqualTo("score null");
    }

    @Test
    public void test_score_1_0(){
        String result = partie.renvoieScore(1,0);

        assertThat(result).isEqualTo("15-0");
    }

    @Test
    public void test_score_2_0(){
        String result = partie.renvoieScore(2,0);

        assertThat(result).isEqualTo("30-0");
    }
    @Test
    public void test_score_0_1(){
        String result = partie.renvoieScore(0,1);

        assertThat(result).isEqualTo("0-15");
    }
    @Test
    public void test_score_2_1(){
        String result = partie.renvoieScore(2,1);

        assertThat(result).isEqualTo("30-15");
    }

    @Test
    public void test_score_1_2(){
        String result = partie.renvoieScore(1,2);

        assertThat(result).isEqualTo("15-30");
    }

    @Test
    public void test_score_1_1(){
        String result = partie.renvoieScore(1,1);

        assertThat(result).isEqualTo("15A");
    }
    @Test
    public void test_score_2_2(){
        String result = partie.renvoieScore(2,2);

        assertThat(result).isEqualTo("30A");
    }@Test
    public void test_score_3_1(){
        String result = partie.renvoieScore(3,1);

        assertThat(result).isEqualTo("40-15");
    }
}
