//	Anthony Pizzimenti
//
//	Finds the value of pi accurate to 5 places.
//	For AP, my best friend.

public class U4A2
{
	private static final double PI = 3.14159;

	public static void main(String[]args)
	{
		U4A2 x = new U4A2();
	}

	public U4A2()
	{
		int count = 1;
		double div = 3;
		double re = 4;

		do
		{
			if (count % 2 != 0)
				re -= (4/div);
			else if (count % 2 == 0)
				re += (4/div);

			div += 2;

			if (re == PI)
			break;
			count++;
		}
		while (Math.round(re*100000) != (PI*100000));

		System.out.printf("Value of Pi = %.5f\n\n", re);
		System.out.println("Number of elements in the series: " + count);
		System.out.println();
	}
}