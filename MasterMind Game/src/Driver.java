import javax.swing.*;
import java.awt.*;

public class Driver extends JFrame {
	
	private JTextArea area = new JTextArea();
	private Container container = getContentPane();
	
	public static void main(String[]args) {
		Driver x = new Driver();
		x.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public Driver() {
		super.setVisible(true);
		super.setSize(500, 500);
		container.add(area);
		
		Reader x = new Reader();
		String fw = x.getWord();
		int count = 0;

		for (int i = 0; i < 10; i++) {
			String tester = JOptionPane.showInputDialog(null, "Guess away!", "MasterMind", JOptionPane.INFORMATION_MESSAGE);
			String best = x.analyze(tester);
			
			if (tester.equals(fw)) {
				x.editPoints(100 - (i * 10));
				break;
			} else {
				area.append(best + "\n");
			}
			count += 1;
		}
		
		if (count == 0) {
			x.editPoints(-8);
			area.append("\nWow, first try!");
			area.append("\nYou got " + x.getPoints() + " points!");
		} else if (count == 10){
			area.append("\nThe word you were looking for was " + fw + ". ");
			area.append("\nYou only got " + x.getPoints() + " points.");
		} else {
			area.append("\nNice work, you got " + x.getPoints() + " points.");
		}
	}
}