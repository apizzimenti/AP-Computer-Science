// Anthony Pizzimenti
//
// car subclass, which draws a car when the draw() method is called
/* ---------------------- */

import java.awt.Graphics;
import java.awt.Color;

public final class car extends vehicle {
    
    public car(int a, int b) {
        super(a, b);
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(super.getX(), super.getY(), 30, 10);
        g.drawRect(super.getX() - 10, super.getY() + 10, 50, 10);
        g.drawOval(super.getX(), super.getY() + 20, super.getWheel(), super.getWheel());
        g.drawOval(super.getX() + 20, super.getY() + 20, super.getWheel(), super.getWheel());
    }
    
}