//	Anthony Pizzimenti
//
//	Synthetic lottery with a million players going for gold.


public class U5A2
{
	public static void main (String args[])
	{
		lottery x = new lottery();

		int total = 0;
		int d = 0;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;

		int powerweek = x.getPowerball();

		System.out.println("This Week's Numbers Are:");
		int[] week = x.getNum();
		for(int h = 0; h < week.length; h++)
		{
			System.out.print(week[h]+"  ");
		}
		System.out.print(powerweek);
		System.out.println();
		System.out.println();

		while(d <= 1000000)
		{
			int[] y = new int[59];
			int z = 0;
			while(z < y.length)
			{
				y[z] = z+1;
				z++;
			}
			int[] tosses = new int[5];
			int weow = 0;

			for(int i = 0; i < tosses.length; i++)
			{
				do
				{
					weow = (int)(58 * Math.random() + 1);
				}
				while(y[weow-1] == 0);

				tosses[i] = y[weow-1];
				y[weow-1] = 0;
			}
			int powerball = (int)(35 * Math.random() + 1);

			int dankkash = x.check(tosses, powerball);
			total += dankkash;

			if(dankkash == 4)
				count++;

			if(dankkash == 7)
				count1++;

			if(dankkash == 100)
				count2++;

			if(dankkash >= 10000)
			{
				System.out.println("Player #"+d+" wins: "+dankkash);
				for(int jk = 0; jk < tosses.length; jk++)
				{
					System.out.print(tosses[jk]+"  ");
				}
				System.out.print(powerball);
				System.out.println();
				System.out.println();

				if(dankkash == 10000)
					count3++;

				if(dankkash == 500000)
					count4++;

				if(dankkash == 1000000)
					count5++;
			}
			d++;
		}
		System.out.println("$4 Winners:\t\t" + count);
		System.out.println("$7 Winners:\t\t" + count1);
		System.out.println("$100 Winners:\t\t" + count2);
		System.out.println("$10,000 Winners:\t" + count3);
		System.out.println("$500,000 Winners:\t" + count4);
		System.out.println("$1,000,000 Winners:\t" + count5);
	}
}

/* output

*/
