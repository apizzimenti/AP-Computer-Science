//	Anthony Pizzimenti

//	This is the DataSet class.

//	Dedicated to AP, my best friend.

public class DataSet
{
	private int sum;
	private int count;

	public DataSet()
	{
		sum = 0;
		count = 0;
	}

	public DataSet(int a, int b)
	{
		sum = a;
		count = b;
	}

	public int getSum()
	{
		return sum;
	}

	public int getCount()
	{
		return count;
	}

	public void addValue(int x)
	{
		sum = sum + x;
		count ++;
	}

	public double average()
	{
		double average = (double) sum / count;
		return average;
	}
}