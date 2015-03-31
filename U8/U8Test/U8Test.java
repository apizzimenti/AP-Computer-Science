//  Anthony Pizzimenti
//
/*  reads, generates, and sorts a list of basketball players' stats. */
//  for AP, my best friend.
/*  ----------------------- */

import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;

public class U8Test extends JFrame {

    private ArrayList<player> players = new ArrayList<player>();
    private Container contain = getContentPane();
    private JTextArea area = new JTextArea();

    public U8Test() {
        contain.add(area);
        Font except = new Font("monospaced", Font.PLAIN, 14);
        area.setFont(except);
		generate();
		area.append("Original List\n\n");
		printList();
		area.append("\n\n");
		sort();
		area.append("Sorted List\n\n");
        printList();
    }

    public void generate() {
        try {
            Scanner reader = new Scanner(new File(
                "C:\\Users\\westsh\\Dropbox\\Comp Sci\\U8\\U8Test\\u7test.txt"
                ));

            while(reader.hasNext()) {
                players.add(new player(reader.nextLine()));
			}
        }
        catch(IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public static void main(String[]args) {
        U8Test x = new U8Test();
        x.setSize(600,800);
        x.setVisible(true);
        x.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void printList() {
        area.append("Number\tYear\tPosition\tPoint Per Game\n");
        area.append("------\t----\t--------\t--------------\n");
        for (int i = 0; i < 5; i++) {
            player player = players.get(i);
            area.append("  " + player.getNum() + "\t");
            area.append(" " + player.getYear() + "\t");
            area.append("   " + player.getPos() + "\t\t");
            area.append("     " + player.getPoints() + "\n");
        }
    }

    public void sort() {
		Double temp;
		int f;

		for(int i = 1; i < players.size(); i++) {
			player x = players.get(i);
			temp = x.getPoints();
			f = i;
			while (f > 0 && temp > players.get(f-1).getPoints()) {
				player y = players.get(f-1);
				players.set(f, y);
				f--;
			}
			players.set(f, x);
		}
    }
}