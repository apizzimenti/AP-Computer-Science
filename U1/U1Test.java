//	Anthony Pizzimenti
//
/*	This is a driver for the "Employee"
	class, tracking the hard work, trials,
	and tribulations of Harry Hacker.
*/

/*	Dedicated to AP, my best friend.
*/

public class U1Test
{
	public static void main(String[] args)
	{
		Employee x = new Employee();

		System.out.println("Name:   " + x.getName());
		System.out.println("Q1 Salary:   " + x.getSalary());

		x.raiseSalary(4);
		System.out.println("Q2 Salary:   " + x.getSalary());

		x.bonus(200);
		System.out.println("Q3 Salary:   " + x.getSalary());

		x.raiseSalary(5.5);
		System.out.println("Q4 Salary:   " + x.getSalary());

	}
}

/*	Output

	Name:   Hacker, Harry
	Q1 Salary:   55000.0
	Q2 Salary:   57300.0
	Q3 Salary:   57500.0
	Q4 Salary:   60762.5
*/