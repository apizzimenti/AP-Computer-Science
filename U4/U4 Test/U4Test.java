// Anthony Pizzimenti
//
// Designed to find the next prime number.

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;

public class U4Test extends JApplet
{

 public void init()
 {
  String input = JOptionPane.showInputDialog
   ("Enter Base Number: ");

  long x = Long.parseLong(input);
  boolean prime = false;

  long start = System.currentTimeMillis();
  
  x -= 1;
  outerloop: do
  {
   x += 1;
   if(x == 1)
   {
    continue;
   }
   if(x == 2)
   {
    prime = true;
    break;
   }
   if(x % 2 == 0)
   {
    continue;
   }
   for (long d = 3; d*d <= x; d += 2)
   {
    if (x % d == 0) continue outerloop;
   }
   prime = true;
  }
  while (prime != true);

  long end = System.currentTimeMillis();

  long time = end - start;

  JTextArea outputArea = new JTextArea();
  outputArea.setText("Results of the Prime Number Search");
  Container container = getContentPane();
  container.add(outputArea);
  outputArea.append("\n\nBase Number = "+input);
  outputArea.append("\n\nPrime Number = "+x);
  outputArea.append("\n\nElapsed Time = "+time);
 }
}