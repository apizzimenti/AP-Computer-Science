//	Anthony Pizzimenti
//
//	Calculates bowling score for a set of pins knocked down.
//	For AP, my best friend.

public class U5Test
{
	public static void main(String args[])
	{
		int[] pins = {9,0,8,2,9,1,10,10,9,1,10,10,10,7,3,8};
		int length = pins.length;
		int score = 0, i = 0;

		try
		{
			for(int y = 0; y <= 9; y++)
			{
				System.out.print((y+1)+"\t");
			}

			for(int x = 0; x <= 9; x++)
			{
				System.out.print("-"+"\t");
			}

			while(i < pins.length)
			{
				if(pins[i] == 10)
				{
					score += 10 + (pins[i+1] + pins[i+2]);
					i += 1;
				}

				else if(pins[i] < 10 && pins[i+1] < 10 && pins[i]+pins[i+1] != 10)
				{
					score += (pins[i] + pins[i+1]);
					i += 2;
				}

				else if(pins[i] + pins[i+1] == 10)
				{
					score += 10 + (pins[i+2]);
					i += 2;
				}

				System.out.print(score+"\t");
			}
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			int[]copy = new int[2*pins.length];
			System.arraycopy(pins,0,copy,0,pins.length);
			pins = copy;
		}

		int large = pins[0], small = pins[0];
		double avg = 0;

		for(int a = 0; a < pins.length; a++)
		{
			if(pins[a] > large)
				large = pins[a];
			if(pins[a] < small)
				small = pins[a];

			avg += pins[a];
		}

		avg = avg/length;
		String mean = String.format("%.4f", avg);

		System.out.println("");
		System.out.println("Fewest"+"\t"+"# of pins: "+small);
		System.out.println("Most"+"\t"+"# of pins: "+large);
		System.out.println("Average"+"\t"+"# of pins: "+mean+"\n");
	}
}

/*

1       2       3       4       5       6       7       8       9       10
-       -       -       -       -       -       -       -       -       -
9       28      48      77      97      117     147     174     194     212


Fewest  # of pins: 0
Most    # of pins: 10
Average # of pins: 6.6875

*/