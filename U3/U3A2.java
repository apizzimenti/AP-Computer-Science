import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class U3A2 extends JApplet
{
 private String name;
 private double tax;

 public void init()
 {
  name = JOptionPane.showInputDialog("Enter your name:");

  String status = JOptionPane.showInputDialog("Enter Filing Status - Single(S) or Married(M):");
  String blind = JOptionPane.showInputDialog("Are you blind?");
  String agelimit = JOptionPane.showInputDialog("Are you over 65? Yes or No:");

  String a = JOptionPane.showInputDialog("Enter Total Number of Exemptions:");
  int exemptions = Integer.parseInt(a);

  String c = JOptionPane.showInputDialog("Enter wages, salaries, & tips:");
  int income = Integer.parseInt(c);

  String b = JOptionPane.showInputDialog("Enter Income Tax Withheld:");
  int withheld = Integer.parseInt(b);

  if (blind.equals("Yes"))
   exemptions += 1;

  if (agelimit.equals("Yes"))
   exemptions += 1;

  if (status.equals("S"))
   {
    income = income - (1000 * exemptions);

    if ((income >= 0.0) && (income <= 21450.0))
     tax = (income * 0.15);

    else if ((income >= 21450.0) && (income <= 51900.0))
     tax = 3217.5 + ((income - 21450.0) * 0.28);

    else if (income >= 51900.0)
     tax = 11743.5 + ((income - 51900.0) * 0.31);
   }

  if (status.equals("M"))
   {
    String spouseblind = JOptionPane.showInputDialog("Is your spouse blind?");
    String spouseagelimit = JOptionPane.showInputDialog("Is your spouse over 65? Yes or No:");

    if (spouseblind.equals("Yes"))
     exemptions += 1;

    if (spouseagelimit.equals("Yes"))
     exemptions += 1;

    income = income - (1000 * exemptions);

    if (income >= 0.0 && income <= 35800.0)
     tax = (income * 0.15);

    else if (income >= 35800.0 && income <= 86500.0)
     tax = 5370.0 + ((income - 35800.0) * 0.28);

    else if (income >= 86500.0)
     tax = 19566.0 + ((income - 86500.0) * 0.31);
   }

  tax = tax - withheld;

  setBackground(Color.yellow);
 }

 public void paint(Graphics g)
 {
  g.setColor(Color.blue);

  Font a = new Font("Monospaced", Font.BOLD, 16);
  g.setFont(a);

  g.drawString(name + ", below you will find", 25, 50);
  g.drawString("the results of your tax inquiry.", 25, 70);

  String b = String.format("%7.2f", tax);
  String c = b.substring(0,1);
  String d = String.format("%7.2f", -tax);

  if (c.equals("-"))
   g.drawString("Refund = $" + d, 50, 100);

  else
   g.drawString("Owe = $" + b, 50, 100);
 }
}