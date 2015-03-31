//	Anthony Pizzimenti
//	Calculates Elo rating for a game player in a single tournament.

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Container;
import java.io.*;


public class ELO extends JApplet
{
	public void init()
	{
		JTextArea output = new JTextArea();
		Container display = getContentPane();
		display.add(output);
		JFrame frame = new JFrame("Example");

		String cur_rating = JOptionPane.showInputDialog("Your current rating:");
		JOptionPane.showMessageDialog(frame, "Your opponent's Ratings:\nExample: 1000, 2000");
		String opp_rating = JOptionPane.showInputDialog("");
		JOptionPane.showMessageDialog(frame, "Enter Record:\nExample: 4-2");
		String wins_losses = JOptionPane.showInputDialog("");


		String oppcriteria = (", ");
		String[] opprating = opp_rating.split(oppcriteria);

		String recordcriteria = ("-");
		String[] record = wins_losses.split(recordcriteria);

		int rating = Integer.parseInt(cur_rating);

		int a = 0;
		int wins = Integer.parseInt(record[a]);
		int losses = Integer.parseInt(record[a+1]);

		int total_opprating = 0;
		for(int i=0; i<opprating.length; i++)
		{
			int rate = Integer.parseInt(opprating[i]);
			total_opprating += rate;
		}

		double newrate = (double)((total_opprating) + 400*(wins-losses))/(double)(wins+losses);
		int winner = (int)(newrate);

		String old_rating = ("Your previous Elo rating: "+Integer.parseInt(cur_rating)+"\n");
		String new_rating = ("Your current Elo rating: "+winner);
		output.append(old_rating);
		output.append(new_rating);
	}
}