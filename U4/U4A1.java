//	Anthony Pizzimenti
//
//	Driver for the Binary class.
//	Dedicated to AP, my best friend.

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;

public class U4A1 extends JApplet
{
	public void init()
	{
		int count, num, accum, re;
		count = 0;
		accum = 0;
		re = 0;

		String a = "Enter Binary Number:";
		String input = JOptionPane.showInputDialog(a);
		num = Integer.parseInt(input);

		JTextArea y = new JTextArea();
		y.setText("Results of U4A1\n");

		Container z = getContentPane();
		z.add(y);

		while (num != -1)
		{
			Binary x = new Binary(input);
			re = x.convert();
			count++;
			accum += re;
			y.append("\nNumber " + count + ": " + input + " =\t" + re);
			input = JOptionPane.showInputDialog(a);
			num = Integer.parseInt(input);
		}

		double avg = accum/(double)count;

		y.append("\n\nNumber of Numbers\t= " + count);
		y.append("\nAccumulated Value\t= " + accum);
		String b = (String.format("\nMean\t\t= %.2f", avg));
		y.append(b);

	}
}


