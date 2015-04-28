// Anthony Pizzimenti
//
/* rectangle class; extension of point and line classes */
/* for AP, my best friend */
/* ---------------------- */

import java.awt.Graphics;

public final class rectangle extends line {

    private int wid;

    public rectangle(int a, int b, int c, int d) {
        super(a, b, c);
        wid = d;
    }

    public void drawRectangle(Graphics g) {
        for (int i = 0; i < wid; i++) {
            super.drawLine(g);
            super.setY(10);
        }
    }
}