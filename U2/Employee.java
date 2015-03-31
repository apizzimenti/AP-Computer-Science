//	Anthony Pizzimenti
//
/*	This class is designed to mimic
	the fluctuations in pay of some
	employee hacker dude somewhere.
*/

/*	Dedicated to AP, my best friend.
*/

public class Employee
{
	private double s;
	private String n;

	public Employee()
	{
		s = 55000.0;
		n = "Hacker, Harry";
	}

	public void raiseSalary(double x)
	{
		s = x / 100 * s + s;
	}

	public void bonus(int x)
	{
		s = s + x;
	}

	public String getName()
	{
		return n;
	}

	public double getSalary()
	{
		return s;
	}
}