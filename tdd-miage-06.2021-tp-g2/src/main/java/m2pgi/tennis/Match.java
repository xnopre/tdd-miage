package m2pgi.tennis;

public class Match {

    private String nameA;
    private String nameB;

    public Match(String nameA, String nameB) {

        this.nameA = nameA;
        this.nameB = nameB;
    }

    public String afficherScore(int score1, int score2) {

        if(areScoreNuls(score1, score2)) {
            return "Score nul";
        }
        if(score1 >=4 && areScoreEquals(score2, score1)){
            return "Egalite";
        }
        if(areScoreEquals(score1, score2)){
            return getScore(score1)+"A";
        }
        if (score1 > 3 && score1 - score2 >= 2){
            return "Jeu " + this.nameA;
        }
        if (score2 > 3 && score2 - score1 >= 2){
            return "Jeu " + this.nameB;
        }
        if(score1 > score2 && score1 > 3){
            return "Avantage " + this.nameA;
        }
        if(score2 > score1 && score2 > 3){
            return "Avantage " + this.nameB;
        }


        return getScore(score1) +  "-" + getScore(score2);

    }

    private boolean areScoreEquals(int score1, int score2) {
        return score1 == score2;
    }

    private boolean areScoreNuls(int score1, int score2) {
        return areScoreEquals(score1, 0) && areScoreEquals(score2, 0);
    }

    private int getScore(int score) {
        if(areScoreEquals(score, 3)){
            return 40;
        }
        return score*15;
    }

}
