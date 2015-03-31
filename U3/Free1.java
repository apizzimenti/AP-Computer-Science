import java.util.Scanner;

public class Free1
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Hours:");
		double a = in.nextDouble();

		System.out.print("Rate:");
		double b = in.nextDouble();

		worker x = new worker(a, b);

		System.out.println("Pay: $" + x.getPay());
	}
}