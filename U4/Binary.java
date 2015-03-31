//	Anthony Pizzimenti
//
//	Binary class.
//	Dedicated to AP, my best friend.

public class Binary
{
	private String val;

	public Binary(String a)
	{
		val = a;
	}

	public int convert()
	{
		int a = Integer.parseInt(val);
		int b = val.length();
		int start = 0;
		int exp = b - 1;
		int re;
		re = 0;

		while (exp >= 0)
		{
			String c = val.substring(start, (start + 1));
			int d = Integer.parseInt(c);
			double e = d * (Math.pow(2, exp));
			int f = (int)e;
			start++;
			exp--;
			re += f;
		}

		return re;
	}
}