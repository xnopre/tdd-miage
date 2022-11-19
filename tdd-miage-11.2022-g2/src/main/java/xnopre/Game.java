package xnopre;

public class Game {
    private final String nameP1;
    private final String nameP2;

    public Game(String nameP1, String nameP2) {
        this.nameP1 = nameP1;
        this.nameP2 = nameP2;
    }

    private static int conversionToScore(int point) {
        return point == 3 ? 40 : point * 15;
    }

    private static boolean scoreAreEquals(int point1, int point2) {
        return point1 == point2;
    }

    private static boolean scoreAreNuls(int point1, int point2) {
        return point2 == 0 && point1 == 0;
    }

    public String getScore(int point1, int point2) {
        if (point2 == 6) {
            return "Avantage " + nameP2;
        }
        if (point1 == 4) {
            if (point2 < 3) {
                return "Jeu " + this.nameP1;
            }
            return "Avantage " + this.nameP1;
        }
        if (scoreAreNuls(point1, point2)) {
            return "Score Nul";
        }
        if (scoreAreEquals(point1, point2)) {
            return String.format("%dA", conversionToScore(point1));
        }
        return String.format("%d-%d", conversionToScore(point1), conversionToScore(point2));
    }
}
