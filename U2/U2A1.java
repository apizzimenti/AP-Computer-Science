//	Anthony Pizzimenti
//
/*	I did poorly on the last test,
	and I feel badly about that.  I'm trying
	to redeem myself in some way, hopefully by
	preparing better next time.
*/

//	Dedicated to AP, my best friend.

import java.util.Scanner;

public class U2A1
{
	public static void main(String[] args)
	{
		Scanner y = new Scanner(System.in);

		double due;
		double received;

		System.out.print("Enter amount due: ");
		due = y.nextDouble();

		System.out.print("Enter amount received: ");
		received = y.nextDouble();

		due = due*100;
		received = received*100;

		int centsdue = (int)due;
		int centsreceived = (int)received;

		double difference = received - due;
		int centsdifference = (int)difference;

		Cashier x = new Cashier(centsdue, centsreceived, centsdifference);

		System.out.println("Dollars: " + x.getDollars());
		System.out.println("Quarters: " + x.getQuarters());
		System.out.println("Dimes: " + x.getDimes());
		System.out.println("Nickels: " + x.getNickels());
		System.out.println("Pennies: " + x.getPennies());

	}
}

/*	Output

	Enter amount due: 41.35
	Enter amount received: 50.00
	Dollars: 8
	Quarters: 2
	Dimes: 1
	Nickels: 1
	Pennies: 0

*/
