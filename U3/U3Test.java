import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class U3Test extends JApplet
{
 double cost;

 public void init()
 {
  String a = "Enter postage Type & ounces, separated by a space:";
  String b = JOptionPane.showInputDialog(a);
  String c = b.substring(2, b.length());

  String type = b.substring(0, 1);
  double ounces = Double.parseDouble(c);

  Postage x = new Postage(type, ounces);
  cost = x.calculate();

  setBackground(Color.yellow);
 }

 public void paint(Graphics g)
 {
  g.setColor(Color.darkGray);

  Font a = new Font("Monospaced", Font.BOLD, 16);
  g.setFont(a);

  String m = String.format("%7.2f", cost);

  g.drawString("Cost to mail this item =", 25, 100);
  g.drawString("$" + m, 25, 125);
 }
}


