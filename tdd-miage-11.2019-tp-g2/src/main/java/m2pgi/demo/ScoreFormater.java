package m2pgi.demo;

public class ScoreFormater {


    public String format(int score1, int score2) {
        if (scoreAreNuls(score1, score2)) {
            return "Score Nul";
        }

        if(score1 == 4 && score2== 3){
            return "Avantage J1";
        }

        if(score1 >= 4 && score1-score2==2){
            return "Jeu J1";
        }
        if(score1 >= 4 && score1 == score2 ){
            return "Egalite";
        }

        if(score2 >= 4 && score2-score1>=2){
            return "Jeu J2";
        }

        if (scoreAreEquals(score1, score2)) {
            return getScoreValue(score1) + "A";
        }

        return getScoreValue(score1) + "-" + getScoreValue(score2);
    }

    private boolean scoreAreEquals(int score1, int score2) {
        return score1 == score2;
    }

    private boolean scoreAreNuls(int score1, int score2) {
        return score1 == 0 && score2 == 0;
    }

    private int getScoreValue(int score) {
        return score <= 2 ? score * 15 : 40;
    }
}
