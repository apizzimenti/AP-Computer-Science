//	Anthony Pizzimenti
//
/*	This is the class TimeInterval, designed
	to return hours, minutes, and pay for
	a single employee based on values defined
	by the user.
*/

public class TimeInterval
{
	private int start;
	private int end;
	private double pay;

	public TimeInterval(int s, int e, double p)
	{
		start = s;
		end = e;
		pay = p;
	}

	public int getHours()
	{
		int hours = (2400 - start) / 100;
		int hours2 = (2400 - end) / 100;
		int a = hours - hours2;
		return a;	
	}

	public int getMinutes()
	{
		int minutes = start % 100;
		int minutes2 = end % 100;
		int b = minutes + minutes2;
		return b;
	}

	public double getPay()
	{
		int hours = (2400 - start) / 100;
		int hours2 = (2400 - end) / 100;
		int c = hours - hours2;
		double d = (double)c;
		double e = d * pay;

		int minutes = start % 100;
		int minutes2 = end % 100;
		int f = minutes + minutes2;
		double g = (double)f;
		double h = g / 60;
		double i = h * pay;


		double p = e + i;
		return p;
	}
}