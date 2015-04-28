// Anthony Pizzimenti
//
/* subclass to point, superclass to rectangle */
/* for AP, my best friend */
/* ---------------------- */

import java.awt.Graphics;

public class line extends point {

    private int length;

    public line(int a, int b, int len) {
        super(a, b);
        length = len;
    }

    public void drawLine(Graphics g) {
        for (int i = 0; i < length; i++) {
            super.drawPoint(g);
            super.setX(10);
        }
        super.setX(-10*length);
    }
}
