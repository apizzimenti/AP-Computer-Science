// Anthony Pizzimenti
//
// driver for the BaseballPlayer() class
/* for AP, my best friend. */
/* ----------------------- */

import java.util.ArrayList;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;


public class U10Test extends JFrame {

	private JTextArea area = new JTextArea();
	private ArrayList<BaseballPlayer> players = new ArrayList<BaseballPlayer>();
	
	public U10Test() {
		super("Unit 10 Test");
		Font except = new Font("Monospaced", Font.BOLD, 12);
		area.setFont(except);
		Container contain = getContentPane();
		contain.add(area);
		fill();
		
		for(BaseballPlayer x : players) {
			x.setStat();
			area.append(x.toString());
		}
	}
	
	public void fill() {
		players.add(new hitter("Tyler Lawson", 29, 78, 25));
		players.add(new hitter("Jason Brown", 16, 54, 13));
		players.add(new pitcher("Tom Jensen", 9, 50.7, 18));
		players.add(new pitcher("Jason Brown", 10, 72.3, 15));
		players.add(new fielder("Willie Starks", 30, 11, 97, 4));
		players.add(new fielder("Jason Brown", 16, 23, 6, 3));
	}
	
	public static void main(String[]args) {
		U10Test x = new U10Test();
		x.setSize(500, 500);
		x.setVisible(true);
		x.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
