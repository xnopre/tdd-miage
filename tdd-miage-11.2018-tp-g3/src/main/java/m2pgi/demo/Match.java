package m2pgi.demo;

public class Match {

	public String getScore(int score1, int score2) {
		if (scoreAreNul(score1, score2)) {
			return "Score nul";
		}
		if (scoreAreEquals(score1, score2) && score1 > 3) {
			return "Egalité";
		}
		if (scoreAreEquals(score1, score2)) {
			return convert(score1) + "A";
		}
		if (score1 == 4 && score2 < 3) {
			return "J1 gagne";
		}
		if (score1 == 4 && score2 == 3) {
			return "Avantage J1";
		}
		if (score1 == 3 && score2 == 4) {
			return "Avantage J2";
		}

		return convert(score1) + "-" + convert(score2);
	}

	private boolean scoreAreEquals(int score1, int score2) {
		return score1 == score2;
	}

	private boolean scoreAreNul(int score1, int score2) {
		return score1 == 0 && score2 == 0;
	}

	public String convert(int score) {
		switch (score) {
		case 0:
			return "0";
		case 1:
			return "15";
		case 2:
			return "30";
		default:
			return "40";
		}
	}

}
