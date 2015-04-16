public class quiz implements Measurable {

	private int score;
	private String grade;

	public quiz(int a) {
		score = a;
		setGrade();
	}

	public void setGrade() {
		if (score < 90) {
			grade = "B";
		} else if (score < 80) {
			grade = "C";
		} else if (score < 70) {
			grade = "D";
		} else if (score < 60) {
			grade = "F";
		} else {
			grade = "A";
		}
	}

	public String getResult() {
		return grade;
	}
}