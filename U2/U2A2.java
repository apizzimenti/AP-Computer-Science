//	Anthony Pizzimenti
//
//	This is a driver for the TimeInterval class.

import java.util.Scanner;

public class U2A2
{
	public static void main(String[] args)
	{
		Scanner y = new Scanner(System.in);

		int start;
		int end;
		double pay;

		System.out.print("Enter Starting Time: ");
		start = y.nextInt();

		System.out.print("Enter Finishing Time: ");
		end = y.nextInt();

		System.out.print("Enter Pay: ");
		pay = y.nextDouble();


		TimeInterval x = new TimeInterval (start, end, pay);

		System.out.println("Time on Task: " + x.getHours() + " Hours " + x.getMinutes() + " Minutes");
		System.out.printf("Pay: $%.2f", x.getPay());
		System.out.println();


	}
}

/*
	Enter Starting Time: 0930
	Enter Finishing Time: 1700
	Enter Pay: 12.75
	Time on Task: 7 Hours 30 Minutes
	Pay: $95.63
*/