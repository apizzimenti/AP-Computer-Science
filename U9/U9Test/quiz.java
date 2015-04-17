// Anthony Pizzimenti
//
// quiz class, which sets letter grades
// for AP, my best friend
/* ---------------------- */

public class quiz implements Measurable {

    private int score;
    private String grade;

    public quiz(int a) {
        score = a;
        setGrade();
    }

    public void setGrade() {
        if (score < 90 && score > 79) {
            grade = "B";
        } else if (score < 80 && score > 69) {
            grade = "C";
        } else if (score < 70 && score > 59) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        } else if (score > 89) {
            grade = "A";
        }
    }

    public String getResult() {
        return grade;
    }
}