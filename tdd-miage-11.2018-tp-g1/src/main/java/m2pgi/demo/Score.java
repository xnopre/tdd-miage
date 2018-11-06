package m2pgi.demo;

public class Score {

	public String marque(int scoreJ1, int scoreJ2) {
		if (scoreAreNul(scoreJ1, scoreJ2)) {
			return "Score nul";
		}
		if (scoreAreEquals(scoreJ1, scoreJ2)) {
			return conversionPoint(scoreJ1) + "A";
		}
		if (scoreJ1 == 5) {
			return "Avantage J1";
		}
		if (scoreJ1 == 4) {
			return "J1 gagne";
		}
		if (scoreJ2 == 4) {
			return "J2 gagne";
		}
		return conversionPoint(scoreJ1) + " - " + conversionPoint(scoreJ2);
	}

	private boolean scoreAreNul(int scoreJ1, int scoreJ2) {
		return scoreJ1 == 0 && scoreJ2 == 0;
	}

	private boolean scoreAreEquals(int scoreJ1, int scoreJ2) {
		return scoreJ1 == scoreJ2;
	}

	private String conversionPoint(int score) {

		switch (score) {
		case 1:
			return "15";
		case 2:
			return "30";
		case 3:
			return "40";
		default:
			return "0";
		}
	}

}
