//Anthony Pizzimenti
//
/* It's applet time.
*/

import java.applet.Applet;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;

public class Demo3 extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
	}

	public void paint(Graphics g)
	{
		Rectangle x = new Rectangle(25,45,50,25);

		//converts values x, y, width, and height to double
		double x1 = x.getX();
		double y1 = x.getY();
		double width = x.getWidth();
		double height = x.getHeight();


		//changes from a [double] to an [int]
		int x2 = (int)x1;
		int y2 = (int)y1;
		int width2 = (int)width;
		int height2 = (int)height;

		g.setColor(Color.orange);
		g.drawRect(x2,y2,width2,height2);

		g.setColor(Color.green);
		g.fillRect(x2,y2,width2,height2);
	}
}
