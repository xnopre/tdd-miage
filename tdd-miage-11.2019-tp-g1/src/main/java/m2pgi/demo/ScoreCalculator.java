package m2pgi.demo;

public class ScoreCalculator {

    public String calculateScore(int scoreJoueur1, int scoreJoueur2) {

        if(scoreAreNuls(scoreJoueur1, scoreJoueur2)) {
            return "Score Nul";
        }

        if(scoreAreEquals(scoreJoueur1, scoreJoueur2)){
            return getScore(scoreJoueur1)+"A";
        }

        return  getScore(scoreJoueur1)+"-"+getScore(scoreJoueur2);
    }

    private boolean scoreAreEquals(int scoreJoueur1, int scoreJoueur2) {
        return scoreJoueur1 == scoreJoueur2;
    }

    private boolean scoreAreNuls(int scoreJoueur1, int scoreJoueur2) {
        return scoreJoueur1 == 0 && scoreJoueur2 == 0;
    }

    private int getScore(int scoreJoueur) {
        if(scoreJoueur == 3){
            return 40;
        }
        return scoreJoueur*15;
    }
}
