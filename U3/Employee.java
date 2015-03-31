//	unit 3 free response practice questions


//	1
public class Employee
{
	private double hours;
	private double rate;

	public Employee(double a, double b)
	{
		hours = a;
		rate = b;
	}

	public double getPay()
	{
		double pay;

		pay = hours * rate;

		if (hours >= 40)
		pay = 1.5 * (hours * rate);

		return pay;
	}
}

//	2
public class root
{
	private int num;

	public num()
	{
		if (Math.sqrt(num) == Math.pow(num, 0.5))
			System.out.println("SAME");

		else
			System.out.println("DIFFERENT");
	}
}

//	3
public class PlayingCard
{
	private String suit;
	private int value;

	public PlayingCard(String a, int b)
	{
		suit = a;
		value = b;
	}

	public String toString()
	{
		String face;

		switch(value)
		{
			default:
				face = "" + value;
				break;
			case 1:
				face = "Ace";
				break;
			case 11:
				face = "Jack";
				break;
			case 12:
				face = "Queen";
				break;
			case 13:
				face = "King";
				break;
		}

		String a = face + " of " + suit;
		return a;
		}
	}
}

//	4
public int compare(PlayingCard x, PlayingCard y)
{

}

//	Book questions

//	R5.1
//	a
if (quarters > 0)
	System.out.println(quarters + "quarters");

//	b
if ((1+x) > Math.pow(x, Math.sqrt(2)))
	y = y + x;

//	c
if (x == 1)
	y++;

else if (x == 2)
	y = y + 2;

//	d
if (x == 0 && y == 0)
	x = 1;
	y = 1;

//	e
if (x >= 1 && x <= 10)
	System.out.println(x);

//	f
if (!s.equals("Nickels") && !s.equals("Pennies")
	&& (!s.equals("Dimes") && !s.equals("Quarters"))
	System.out.println("Input Error!");

//	g
if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("NO"))
	return input;

//	h?

//	i
language = "English";

if (country.equals("US"))
	{
		if (state.equals("PR"))
			language = "Spanish";
		else
			language = "English";
	}

else if (country.equals("China"))
	language = "Chinese";

//	R5.2
//	a
y += x.getValue();

//	b
x == 0

//	c
can be simple, compound, or block

//	d
System.out.println("")p

//	e
if (condition)
	x = x-1;

//	f
if (condition)
{
	x = 2;
	y = 3;
}

//	R5.5
/*	Dick, Tomato, Churchill, car manufacturer, hairy, car, neither, C++, 
	bar, 101, 1.01
*/

//	R5.6













//	R5.8
//	true

//	R5.9
/*	In the first one, s will be incremented as many times as x and y are more
	0.  In the second one, if x is greater than 0, s will be incremented.  If
	it isn't, then it tests to see whether y is greater than 0.  If it's true,
	s will be incremented.  If not, s won't be incremented.
*/

//	R5.10
//	a
!(x > 0) || !(y > 0)
//	b
!(x != 0) && !(y != 0)
//	c -- what?
//	d

//	R5.12
/*	first checks to see whether they are stored in the same memory address, 
	other checks for string.
*/

//	R5.13
//	first is checking for the same rectangle, second is for string.

//	R5.14
/*	it's checking to see if the string has the same characters as null; to check
	for null, you must use ==.
*/

//	R5.15
/*	uppercase and lowercase letters are considered in computer, as well as 
	symbols and spaces
*/	













