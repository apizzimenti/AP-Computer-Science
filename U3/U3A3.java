import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Container;

public class U3A3 extends JApplet
{
 private String monthName;
 public void init()
 {
  int month;

  String a = "Please enter the month as a number:";
  String b = JOptionPane.showInputDialog(a);
  month = Integer.parseInt(b);

  switch(month)
  {
   case 1:
    monthName = "January";
    break;
   case 2:
    monthName = "February";
    break;
   case 3:
    monthName = "March";
    break;
   case 4:
    monthName = "April";
    break;
   case 5:
    monthName = "May";
    break;
   case 6:
    monthName = "June";
    break;
   case 7:
    monthName = "July";
    break;
   case 8:
    monthName = "August";
    break;
   case 9:
    monthName = "September";
    break;
   case 10:
    monthName = "October";
    break;
   case 11:
    monthName = "November";
    break;
   case 12:
    monthName = "December";
    break;
  }

  Month x = new Month(month);

  String sent = "The month of " + monthName + "\nhas " + x.getDays();

  JTextArea y = new JTextArea();
  y.setText(sent);

  Container z = getContentPane();
  z.add(y);
 }
}

