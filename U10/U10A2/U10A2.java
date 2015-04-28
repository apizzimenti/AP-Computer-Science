// Anthony Pizzimenti
//
/* driver for the rectangle() class */
/* for AP, my best friend */
/* ---------------------- */

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class U10A2 extends JApplet {

    public void init() {
        setBackground(Color.yellow);
    }
    
    public void paint(Graphics g) {
        rectangle x = new rectangle(25, 30, 10, 5);
        x.drawRectangle(g);
        
        rectangle y = new rectangle(75, 100, 15, 3);
        y.drawRectangle(g);
        
        rectangle z = new rectangle(50, 200, 8, 12);
        z.drawRectangle(g);
    }
}
        


