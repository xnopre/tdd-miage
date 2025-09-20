package xnopre;

public class Partie {


    public String renvoieScore(int score1, int score2) {
        if(score1==score2) {
            if(score1!=0)
                return convert(score1) +"A";
            return "score null";
        }

        return convert(score1) +"-"+ convert(score2);

    }

    private static int convert(int score1) {
        if(score1 == 3)
        return 40;
      return score1 * 15;}



}
