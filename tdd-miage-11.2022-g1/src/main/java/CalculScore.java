public class CalculScore {
    private final String prenom1;
    private final String prenom2;

    public CalculScore(String prenom1, String prenom2) {
        this.prenom1 = prenom1;
        this.prenom2 = prenom2;
    }

    public String getScore(int pointsJ1, int pointsJ2) {
        if (pointsJ1 == 0 && pointsJ2 == 0) {
            return "Score Nul";
        }
        if (pointsJ1 == pointsJ2) {
            return this.convertScore(pointsJ1) + "A";
        }
        if (pointsJ1 == 4) {
            return "Jeu " + this.prenom1;
        }

        return this.convertScore(pointsJ1) + "-" + this.convertScore(pointsJ2);
    }

    private String convertScore(int points) {
        if (points > 2) {
            return "40";
        }
        return Integer.toString(points * 15);
    }
}
