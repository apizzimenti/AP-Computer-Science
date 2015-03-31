//dankmemer
//weow
//HERUURHRURH

public class hyuk
{
	public static void main (String args[])
	{
		for(int a = 1; a <= 4; a++)
		{
			for(int d = 1; d <= a-1; d++)
			{
				System.out.print("-");
			}

			System.out.print(a*2);

			for(int c = 1; c <= (6 - a); c++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
	}
}