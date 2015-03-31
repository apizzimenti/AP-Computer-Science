//	Anthony Pizzimenti
//
/*	The Cashier class, to help Cashiers
	in need.
*/

//Dedicated to AP, my best friend.

public class Cashier
{
	private int money;
	private int cost;
	private int amtdiff;

	public Cashier (int due, int rec, int diff)
	{
		money = due;
		cost = rec;
		amtdiff = diff;
	}

	public int getDollars()
	{
		int dollars = amtdiff/100;
		amtdiff = amtdiff - 100*dollars;
		return dollars;
	}

	public int getQuarters()
	{
		int quarters = amtdiff/25;
		amtdiff = amtdiff - 25*quarters;
		return quarters;
	}

	public int getDimes()
	{
		int dimes = amtdiff/10;
		amtdiff = amtdiff - 10*dimes;
		return dimes;
	}

	public int getNickels()
	{
		int nickels  = amtdiff/5;
		amtdiff = amtdiff - 5*nickels;
		return nickels;
	}

	public int getPennies()
	{
		int pennies = amtdiff/100;
		amtdiff = amtdiff - 100*pennies;
		return pennies;
	}

}
