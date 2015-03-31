//  Cylinder Notes
//
//  **ALL INSTANCE FIELDS ARE PRIVATE**

public class Cylinder
{
	private int height; 	//  instance fields
	private int radius;

	public Cylinder()		/*	default constructor;
							initializes instance fields
							*/
	{
		height = 9;			//	parameters of cylinder
		radius = 5;
	}

	public double volume()	// volume method
	{
		double v;

		v = 3.14 * radius * radius * height;

		return v;
	}

	public double surfaceArea()
	{
		double sa;
		sa = 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;

		return sa;
	}

	public int getHeight()	/*	accessor method
								allows client to find/use
								radius and height
							*/
	{
		return height;
	}

	public int getRadius()
	{
		return radius;
	}
}