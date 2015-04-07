import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class U9A1 extends JFrame {

    private JTextArea area = new JTextArea();
    private Font out = new Font("Monospaced", Font.BOLD, 12);
    private Container contain = getContentPane();

    public static void main(String[]args) {
        U9A1 x = new U9A1();
        x.setSize(300, 500);
        x.setVisible(true);
        x.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public U9A1() {
        testBBPlayer();
        testbankaccount();
        contain.add(area);
    }

    public void testBBPlayer() {
        String input;
        DataSet set = new DataSet();

        try {
            Scanner in = new Scanner(new File("/Users/Anthony/Dropbox/Comp Sci/U9/U9A1/u7test.txt"));
            while (in.hasNext()) {
                input = in.nextLine();
                player newPlayer = new player(input);
                Measurable meas1 = newPlayer;
                set = new DataSet(meas1);
            }
            in.close();
        } catch (IOException except) {
            throw new RuntimeException(except.toString());
        }
        area.setFont(out);
        area.setText("BBPlayer Stats\n");
        area.append("--------------\n\n");
        area.append("Minimum Points Per Game = " + set.getMin() + "\n\n");
        area.append("Maximum Points Per Game = " + set.getMax() + "\n\n");
        area.append("Average Points Per Game = " + set.getAve() + "\n\n\n");
    }

    public void testbankaccount() {
        Double input;
        String parsed;
        DataSet setter = new DataSet();

        try {
            Scanner in = new Scanner(new File("/Users/Anthony/Dropbox/Comp Sci/U9/U9A1/myCreditUnion.txt"));
            while (in.hasNext()) {
                parsed = in.nextLine();
                input = Double.parseDouble(parsed.substring(5, parsed.length()));
                bankaccount newAccount = new bankaccount(input);
                Measurable meas2 = newAccount;
                setter = new DataSet(meas2);
            }
            in.close();
        } catch (IOException except) {
            throw new RuntimeException(except.toString());
        }

        area.setFont(out);
        area.append("BankAccount Stats\n");
        area.append("-----------------\n\n");
        area.append("Minimum Bank Account = " + setter.getMin() + "\n\n");
        area.append("Maximum Bank Account = " + setter.getMax() + "\n\n");
        String format = String.format("%.2f", setter.getAve());
        area.append("Average Bank Account  = " + format + "\n\n");
    }
}