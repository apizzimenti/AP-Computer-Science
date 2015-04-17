// Anthony Pizzimenti
//
// driver for the quiz, dice, and tally classes
// for AP, my best friend
/* ---------------------- */

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class U9Test extends JFrame {

    private JTextArea area = new JTextArea();
    private Container container = getContentPane();

    public U9Test() {
        Font except = new Font("Monospaced", Font.BOLD, 12);
        area.setFont(except);
        container.add(area);
        dice();
        quiz();
    }

    public static void main(String[]args) {
        U9Test x = new U9Test();
        x.setSize(300, 500);
        x.setVisible(true);
        x.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void dice() {
        String[]rolls = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        tally dice = new tally(rolls);

        for (int i = 0; i < 100; i++) {
            int first = 1 + (int)(Math.random() * 6);
            int second = 1 + (int)(Math.random() * 6);

            dice dicer = new dice(first, second);
            Measurable meas1 = dicer;
            dice.process(meas1);
        }

        area.append("\tDice Tally\n");
        area.append("\t----------\n");
        area.append("\nItem\t\tTally\n");
        area.append("----\t\t-----\n");

        int[]newer = dice.getTally();

        for (int f = 0; f < rolls.length; f++) {
            area.append(" " + rolls[f] + "\t\t " + newer[f] + "\n");
        }
	}

	public void quiz() {
		String[]letters = {"A", "B", "C", "D", "F"};
		tally grades = new tally(letters);

        for (int j = 0; j < 100; j++) {

            int grader = 51 + (int)(Math.random() * 50);

            quiz quizzer = new quiz(grader);
            Measurable meas2 = quizzer;
            grades.process(meas2);
        }

        int[]newest = grades.getTally();

        area.append("\n\n\tQuiz Tally\n");
        area.append("\t----------\n");
        area.append("\nItem\t\tTally\n");
        area.append("----\t\t-----\n");

        for (int f = 0; f < letters.length; f++) {
            area.append(letters[f] + "\t\t" + newest[f] + "\n");
        }
    }
}
