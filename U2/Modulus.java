public class Modulus
{
	private int divisor;
	private int dividend;
	
	public Modulus()
	{
		divisor = 0;
		dividend = 0;
	}

	public Modulus (int a, int b)
	{
		divisor = a;
		dividend = b;
	}

	public int getMod()
	{
		int a = divisor / dividend;
		int b = a * dividend;
		int c = divisor - b;
		return c;
	}

}



