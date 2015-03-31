// Anthony Pizzimenti
//
// Using the "Cylinder" class in a program

public class Driver1
{
	public static void main(String[] args)
	{
		Cylinder x = new Cylinder();

		int h = x.getHeight();
		int r = x.getRadius();

		System.out.println("Radius = " + r);
		System.out.println("Height = " + h);
		System.out.println();

		double v = x.volume();
		double sa = x.surfaceArea();

		System.out.println("Volume = " + v);
		System.out.println("Surface Area = " + sa);
	}
}