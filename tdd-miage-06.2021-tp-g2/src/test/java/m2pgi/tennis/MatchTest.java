package m2pgi.tennis;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatchTest {

    Match match = new Match("A", "B");

    @Test
    public void testAfficherScoreNul(){
        String result = match.afficherScore(0,0);
        assertThat(result).isEqualTo("Score nul");
    }

    @Test
    public void testAfficherScore10(){
        String result = match.afficherScore(1,0);
        assertThat(result).isEqualTo("15-0");
    }

    @Test
    public void testAfficherScore20(){
        String result = match.afficherScore(2,0);
        assertThat(result).isEqualTo("30-0");
    }

    @Test
    public void testAfficherScore01(){
        String result = match.afficherScore(0,1);
        assertThat(result).isEqualTo("0-15");
    }

    @Test
    public void testAfficherScore02(){
        String result = match.afficherScore(0,2);
        assertThat(result).isEqualTo("0-30");
    }

    @Test
    public void testAfficherScore31(){
        String result = match.afficherScore(3,1);
        assertThat(result).isEqualTo("40-15");
    }

    @Test
    public void testAfficherScore22(){
        String result = match.afficherScore(2,2);
        assertThat(result).isEqualTo("30A");
    }

    @Test
    public void testAfficherScore43(){
        String result = match.afficherScore(4,3);
        assertThat(result).isEqualTo("Avantage A");
    }

    @Test
    public void testAfficherScore34(){
        String result = match.afficherScore(3,4);
        assertThat(result).isEqualTo("Avantage B");
    }
    @Test
    public void testAfficherScoreEgalite(){
        String result = match.afficherScore(4,4);
        assertThat(result).isEqualTo("Egalite");
    }
    @Test
    public void testAfficherScoreEgalite66(){
        String result = match.afficherScore(6,6);
        assertThat(result).isEqualTo("Egalite");
    }

    @Test
    public void testAfficherScoreAvantageA(){
        String result = match.afficherScore(8,7);
        assertThat(result).isEqualTo("Avantage A");
    }

    @Test
    public void testAfficherScoreAvantageB(){
        String result = match.afficherScore(9,10);
        assertThat(result).isEqualTo("Avantage B");
    }

    @Test
    public void testAfficherScoreJeuA(){
        String result = match.afficherScore(5,3);
        assertThat(result).isEqualTo("Jeu A");
    }

    @Test
    public void testAfficherScoreJeuA40(){
        String result = match.afficherScore(4,0);
        assertThat(result).isEqualTo("Jeu A");
    }

    @Test
    public void testAfficherScoreJeuB(){
        String result = match.afficherScore(3,5);
        assertThat(result).isEqualTo("Jeu B");
    }

    @Test
    public void testAfficherScoreAvantageBob(){
        Match match = new Match("A", "Bob");
        String result = match.afficherScore(9,10);
        assertThat(result).isEqualTo("Avantage Bob");
    }
}
