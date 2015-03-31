//dankmemer
//weow
//hoefajiejf

public class hyuk2
{
	public static void main (String args[])
	{
		double pop = 89.2;
		int year = 1990;
		while(pop < 120)
		{
			year++;
			pop *= 1.023;
			System.out.printf("%d: %.1f%n", year, pop);
		}
	}
}