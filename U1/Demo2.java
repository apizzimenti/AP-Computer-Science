//Anthony Pizzimenti
//
/* Demonstration of a rectangle.
*/

import java.awt.Rectangle;

public class Demo2
{
	public static void main(String[] args)
	{
		Rectangle x = new Rectangle(5,8,10,20);

		x.setLocation(15,18);

		boolean y = x.contains(12,9);

		System.out.println(x);
		System.out.println();
		System.out.println(y);
	}
}