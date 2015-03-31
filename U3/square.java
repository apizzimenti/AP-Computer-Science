import java.lang.Math;
import java.util.Scanner;

public class square
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Num:");
		int a = in.nextInt();

		if (Math.sqrt(a) == Math.pow(a, 0.5));
			{
				System.out.println("Same");
			}

		else
			System.out.println("Different");
	}
}