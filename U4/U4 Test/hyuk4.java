//jweopfijwefoi
//fehjwoijfwww
//eeeeeeiowio

public class hyuk4
{
	public String myFactors()
	{
		String fuck = "";
		for(int i = 30; i <= 50; i++)
		{
			fuck += i+"\t";
			for(int a = 1; a <= i; a++)
			{
				if(i%a == 0)
				fuck += (a + ", ");
			}
			fuck += ("\n");
		}
		return fuck;
	}
}