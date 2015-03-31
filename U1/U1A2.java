//  Anthony Pizzimenti
//
/*  This application creats a series of rectangles
	whose parameters are defined and stated as the
	output of the application.

/*  Dedicated to AP, my best friend.
*/

/*  Imports the Rectangle class from the java.awt
	Library.
*/
import java.awt.Rectangle;

public class U1A2
{
	public static void main(String[]args)
	{
		//  Defines Rectangles 1-3.
		Rectangle r1 = new Rectangle(5,10,20,30);
		Rectangle r2 = new Rectangle(10,25,35,15);
		Rectangle r3 = new Rectangle(20,30,10,25);

		/*  Displays coordinates of r1, r2, r3;
			skips a line.
		*/
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println();

		/*  Defines intersections of r1 and r2,
			denoted as r4, and the intersections
			of r1 and r3, denoted as r5.
		*/
		Rectangle r4 = r1.intersection(r2);
		Rectangle r5 = r1.intersection(r3);

		/*  Displays intersection coordinates for
			new rectangles.
		*/
		System.out.println(r4);
		System.out.println(r5);
	}
}

//Output:

/*

java.awt.Rectangle[x=5,y=10,width=20,height=30]
java.awt.Rectangle[x=10,y=25,width=35,height=15]
java.awt.Rectangle[x=20,y=30,width=10,height=25]

java.awt.Rectangle[x=10,y=25,width=15,height=15]
java.awt.Rectangle[x=20,y=30,width=5,height=10]

*/