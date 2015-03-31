//	Anthony Pizzimenti
//
/*	This is a driver running the
	RoachPopulation class.
*/

public class U1A3
{
	public static void main(String[] args)
	{
		RoachPopulation x = new RoachPopulation();

		x.timePasses();
		System.out.println("Population = " + x.getRoaches());

		x.spray();
		System.out.println("Population = " + x.getRoaches());

		x.spray();
		System.out.println("Population = " + x.getRoaches());

		x.timePasses();
		System.out.println("Population = " + x.getRoaches());
	}
}

//	Output:
/*
	Population = 200
	Population = 180
	Population = 162
	Population = 324
*/

