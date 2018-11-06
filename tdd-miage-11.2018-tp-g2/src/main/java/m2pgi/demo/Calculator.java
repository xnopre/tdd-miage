package m2pgi.demo;

public class Calculator {

	public String calculate(int scorePlayerOne, int scorePlayerTwo) {
		if (scoreAreNuls(scorePlayerOne, scorePlayerTwo)) {
			return "Score Nul";
		}
		if (scoreAreEquals(scorePlayerOne, scorePlayerTwo)) {
			return convert(scorePlayerOne) + "A";
		}
		if (scorePlayerOne > 3 || scorePlayerTwo > 3) {
			if (scorePlayerOne - scorePlayerTwo >= 2) {
				return "J1 gagne";
			}
			if (scorePlayerOne > scorePlayerTwo) {
				return "Avantage J1";
			}
			return "Avantage J2";

		}

		return convert(scorePlayerOne) + "-" + convert(scorePlayerTwo);

	}

	private boolean scoreAreEquals(int scorePlayerOne, int scorePlayerTwo) {
		return scorePlayerOne == scorePlayerTwo;
	}

	private boolean scoreAreNuls(int scorePlayerOne, int scorePlayerTwo) {
		return scorePlayerOne == 0 && scorePlayerTwo == 0;
	}

	private String convert(int score) {
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
