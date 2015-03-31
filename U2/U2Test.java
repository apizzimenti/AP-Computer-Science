//	Anthony Pizzimenti

//	This is the driver for the DataSet class.

//	Dedicated to AP, my best friend.

import java.util.Scanner;

public class U2Test
{
	public static void main(String [] args)
	{
		Scanner x = new Scanner(System.in);

		System.out.print("Enter Integer #1: ");
		int a = x.nextInt();

		System.out.print("Enter Integer #2: ");
		int b = x.nextInt();

		System.out.print("Enter Integer #3: ");
		int c = x.nextInt();

		System.out.print("Enter Integer #4: ");
		int d = x.nextInt();
		System.out.println();

		DataSet y = new DataSet();
		DataSet z = new DataSet(73, 8);

		y.addValue(a);
		y.addValue(b);
		y.addValue(c);
		y.addValue(d);

		z.addValue(a);
		z.addValue(b);
		z.addValue(c);
		z.addValue(d);

		System.out.printf("Default Constructor Average    = %.1f%n", y.average());
		System.out.println();
		System.out.printf("Parametric Constructor Average = %.1f%n" , z.average());
		System.out.println();
	}
}

/*

Enter Integer #1: 45
Enter Integer #2: 32
Enter Integer #3: 66
Enter Integer #4: 4

Default Constructor Average    = 36.8

Parametric Constructor Average = 18.3


*/