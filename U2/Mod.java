import java.util.Scanner;

public class Mod
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		int divisor;
		int dividend;
		
		System.out.print("Enter Divisor: ");
		divisor = in.nextInt();
		System.out.println();
		
		System.out.print("Enter Dividend: ");
		dividend = in.nextInt();
		System.out.println();
		
		Modulus x = new Modulus(divisor, dividend);
		System.out.print("Remainder: " + x.getMod());
		System.out.println();
	}
}
