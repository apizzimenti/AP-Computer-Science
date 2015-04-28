// Anthony Pizzimenti
//
/* superclass to line and rectangle classes */
/* for AP, my best friend */
/* ---------------------- */

import java.awt.Graphics;
import java.awt.Color;

public class point {

    private int x;
    private int y;

    public point(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int a) {
        x += a;
    }

    public void setY(int a) {
        y += a;
    }

    public void drawPoint(Graphics g) {
        g.setColor(Color.green);
        g.drawString("*", x, y);
    }
}



