package xnopre;

public class ScoreHandler {
    public static String getScore(int scoreJoueur1, int scoreJoueur2) {
        if(scoreJoueur1 == scoreJoueur2){
            if(scoreJoueur1 !=0 ){
                return scoreJoueur1*15+"A";
            }
            return "Score Nul";
        }
        if(scoreJoueur1==3){
            return "40-15";
        }

        return 15 * scoreJoueur1 + "-"+ 15*scoreJoueur2;
    }
}
