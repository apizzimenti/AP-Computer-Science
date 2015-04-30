// Anthony Pizzimenti
//
// vehicle superclass, with original positions
/* ---------------------- */

import java.awt.Graphics;

public abstract class vehicle {
    
    private int initX;
    private int initY;
    
    // widths/heights of wheels
    private final int wheel = 6;
    
    public vehicle(int a, int b) {
        initX = a;
        initY = b;
    }
    
    public abstract void draw(Graphics g);
    
    public int getX() {
        return initX;
    }
    
    public int getY(){
        return initY;
    }
    
    public int getWheel() {
        return wheel;
    }
}