// Anthony Pizzimenti
//
// driver for the vehicle class and its subclasses
/* for AP, my best friend */
/* ---------------------- */

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class U10A3 extends JFrame {

    private ArrayList<vehicle> list = new ArrayList<vehicle>();

    public U10A3() {
        super("Unit 10 Assignment 3");
        Container contain = getContentPane();
        contain.setBackground(Color.yellow);

        for (int i = 0; i < 10; i++) {
            int x = (int)(Math.random() * 450);
            int y = (int)(Math.random() * 450);
            int chooser = 1 + (int)(Math.random() * 2);

            if (chooser == 1) {
                list.add(new car(x, y));
            } else if (chooser == 2) {
                list.add(new truck(x, y));
            }
        }
    }

    public static void main(String[]args) {
        U10A3 x = new U10A3();
        x.setSize(500, 500);
        x.setVisible(true);
        x.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (vehicle x : list) {
            x.draw(g);
        }
    }
}