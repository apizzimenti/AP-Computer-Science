//	Anthony Pizzimenti
//
//	Makes up winning numbers and checks to see if they're right.

import java.util.Arrays;

public class lottery
{
	private int[] num = new int[5];
	private int powerball;

	public lottery()
	{
		int[] y = new int[59];
		int z = 0;
		while(z < y.length)
		{
			y[z] = z+1;
			z++;
		}
		int weow = 0;

		for(int i = 0; i < num.length; i++)
		{
			do
			{
				weow = (int)(59 * Math.random()+ 1);
			}
			while(y[weow-1] == 0);

			num[i] = y[weow-1];
			y[weow-1] = 0;
		}
		powerball = (int)(35 * Math.random() + 1);
	}

	public int check(int[] nums, int pb)
	{
		int counter = 0;
		for(int c = 0; c < nums.length; c++)
		{
			for(int d = 0; d < num.length; d++)
			{
				if(nums[c] == num[d]) counter++;
			}
		}

		if(Arrays.equals(nums, num) && pb == powerball)
			return 1000000;

		if(Arrays.equals(nums, num) && pb != powerball)
			return 500000;

		if(counter == 4 && pb == powerball)
			return 10000;

		if(counter == 4 && pb != powerball)
			return 100;

		if(counter == 3 && pb == powerball)
			return 100;

		if(counter == 3 && pb != powerball)
			return 7;

		if(counter == 2 && pb == powerball)
			return 7;

		if(counter == 2 && pb != powerball)
			return 0;

		if(counter == 1 && pb == powerball)
			return 4;

		if(counter == 0 && pb == powerball)
			return 4;

		else
			return 0;
	}

	public int[] getNum()
	{
		return num;
	}

	public int getPowerball()
	{
		return powerball;
	}
}