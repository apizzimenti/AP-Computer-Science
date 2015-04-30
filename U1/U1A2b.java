//  Anthony Pizzimenti
//
/*  This project will create a series a series of
 rectangles, outlined in blue, and the area
 of their intersection, filled in red.
 */

/*  Dedicated to AP, my best friend.
 */

/*  Imports Rectangle, Color, and Graphics classes
 from the Java AWT Library.
 */
import java.applet.Applet;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class U1A2b extends Applet
{
    /*  Used to define initial characteristics;
     in this case, background color.
     */
    public void init()
    {
        setBackground(Color.yellow);
    }
    
    /*  Allows for the implementation of graphics
     such as rectangles and their subsequential
     display in a console or HTML environment.
     */
    public void paint(Graphics g)
    {
        //  Defines the coordinates of r1 and r2.
        Rectangle r1 = new Rectangle(5,10,50,80);
        Rectangle r2 = new Rectangle(20,50,65,55);
        
        /*  Defines the intersection of r1 and r2
         and creates a third rectangle, r3, of
         the intersection area.
         */
        Rectangle r3 = r1.intersection(r2);
        
        /*  Converts the unknown intersection
         coordinates into double-precision values.
         */
        double x1 = r3.getX();
        double y1 = r3.getY();
        double width = r3.getWidth();
        double height = r3.getHeight();
        
        /*  Defines the unknown double values of the
         intersection of r1 and r2 as integers,
         denoted by variables a, b, w, and h.
         */
        int a = (int)x1;
        int b = (int)y1;
        int w = (int)width;
        int h = (int)height;
        
        /*  Defines the colors of the rectangles'
         borders, and displays rectangles r1 and
         r2.
         */
        g.setColor(Color.blue);
        g.drawRect(5,10,50,80);
        g.drawRect(20,50,65,55);
        
        /*  Defines the color of the rectangle
         intersection of r1 and r2, and provides
         the intersection parameters, defined as
         a, b, w, and h.
         */
        g.setColor(Color.red);
        g.fillRect(a,b,w,h);
    }
}