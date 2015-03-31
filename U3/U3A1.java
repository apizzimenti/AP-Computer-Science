import javax.swing.JOptionPane;

public class U3A1
{
 public static void main(String [] args)
 {
  String origLetter;
  String a;

  origLetter = JOptionPane.showInputDialog("Please Enter Letter Grade: ");
  a = JOptionPane.showInputDialog("Please Enter Numeric Grade: ");

  double origNumeric = Double.parseDouble(a);

  Grade x = new Grade(origLetter, origNumeric);

  x.setNewNumeric();
  x.setNewLetter();

  String b;
  String c;

  b = "Numeric Grade Equivalent = " + x.getNewNumeric();
  b += "\n\n";
  c = "Letter Grade Equivalent = " + x.getNewLetter();

  JOptionPane.showMessageDialog(null, b + c, "U3A1", JOptionPane.INFORMATION_MESSAGE);
 }
}