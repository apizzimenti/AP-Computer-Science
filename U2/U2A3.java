//	Anthony Pizzimenti
//
//	Driver for the EasterSunday class.
//	Dedicated to AP, my best friend.


import java.io.*;
import java.util.Scanner;

public class U2A3
{
	public static void main(String [] args)
	{
		U2A3 a = new U2A3();
	}

	public U2A3()
	{
		Scanner in = new Scanner(System.in);

		int year;
		int month;
		int day;
		String monthname;

		System.out.print("Enter the year: ");
		year = in.nextInt();

		EasterSunday x = new EasterSunday(year);

		month = x.getMonth();
		day = x.getDay();

		monthname = this.getMonthName(month);

		System.out.printf("%nEaster Sunday is on %s%d.%n",
		monthname, day);
		System.out.println();
	}

	private String getMonthName(int month)
	{
		Scanner in;
		try
		{
			in = new Scanner(new File("U:\\PROJECTS\\West Projects\\Computer Science\\JavaData\\U2A3.txt"));
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		String inputLine = in.nextLine();
		String myString = inputLine.substring((month-1) * 9, month * 9);
		return myString;
	}
}

/*
	Enter the year: 2011

	Easter Sunday is on April    24.
*/