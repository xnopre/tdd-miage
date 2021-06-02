package m2pgi.demo;

public class Match {
    public String getScore(int scoreA, int scoreB) {

        if(areScoreNuls(scoreA, scoreB)) {
            return "Score nul";
        }
        if(scoreA == 4 && scoreB == 4){
            return "Egalité";
        }
        if (areScoreEquals(scoreA, scoreB)){
            return getStringFromScore(scoreA) + "A";
        }
        if(scoreA-scoreB == 1 && scoreB>=3){
            return "Avantage A";
        }

        return getStringFromScore(scoreA)+"-"+getStringFromScore(scoreB);

    }

    private boolean areScoreEquals(int scoreA, int scoreB) {
        return scoreA == scoreB;
    }

    private boolean areScoreNuls(int scoreA, int scoreB) {
        return scoreA == 0 && scoreB == 0;
    }

    private int getStringFromScore(int score) {
        if(score < 3){
            return score*15;
        }
        return 40;
    }
}
