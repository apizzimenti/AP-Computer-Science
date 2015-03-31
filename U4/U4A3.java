//	Anthony Pizzimenti
//
//	Makes a salary schedule for teachers.
//	For AP, my best friend.

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;
import java.util.StringTokenizer;

public class U4A3 extends JApplet
{
	public void init()
	{
		String salary = JOptionPane.showInputDialog
			("Base Salary (10000 - 50000), \n Enter Number of Lanes (3-6), \n Enter Number of Steps per Lane (10 - 20) \n\n (Separate the numbers with single spaces)");

		StringTokenizer token = new StringTokenizer(salary);
		String a = token.nextToken();
		String b = token.nextToken();
		String c = token.nextToken();

		int d = Integer.parseInt(a);
		int e = Integer.parseInt(b);
		int f = Integer.parseInt(c);

		JTextArea output = new JTextArea();
		output.setText("\t\tSalary Schedule\n\n");

		for (int count = 1; count <= e; count++)
		{
			output.append("\t     " + count);
		}

		output.append("\n\n");

		Container contain = getContentPane();
		contain.add(output);

		output.setTabSize(5);

		int lane = d;
		int step = 0;

		for(int i = 0; i < f; i++)
		{
			output.append((i + 1) + "\t");
			step = lane;
			for(int j = 0; j < e; j++)
			{
				output.append(step + "\t");
				step *= 1.09;
			}
			output.append("\n");
			lane *= 1.03;
		}
	}
}




