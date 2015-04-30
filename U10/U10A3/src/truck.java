// Anthony Pizzimenti
//
// truck subclass, which draws a truck when the draw() method is called
/* ---------------------- */

import java.awt.Graphics;
import java.awt.Color;

public final class truck extends vehicle {
    
    public truck(int a, int b) {
        super(a, b);
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(super.getX(), super.getY() + 20, 40, 40);
        g.drawRect(super.getX() + 42, super.getY(), 160, 60);
        g.drawOval(super.getX() + 2, super.getY() + 60, super.getWheel(), super.getWheel());
        g.drawOval(super.getX() + 38, super.getY() + 60, super.getWheel(), super.getWheel());
        g.drawOval(super.getX() + 44, super.getY() + 60, super.getWheel(), super.getWheel());
        g.drawOval(super.getX() + 50, super.getY() + 60, super.getWheel(), super.getWheel());
        g.drawOval(super.getX() + 144, super.getY() + 60, super.getWheel(), super.getWheel());
        g.drawOval(super.getX() + 150, super.getY() + 60, super.getWheel(), super.getWheel());
    }
}