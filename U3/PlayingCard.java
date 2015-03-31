public class PlayingCard
{
	private String suit;
	private int value;

	public PlayingCard(String a, int b)
	{
		suit = a;
		value = b;
	}

	public String getSuit()
	{
		return suit;
	}

	public int getValue()
	{
		return value;
	}

	public String toString()
	{
		String face;

		switch(value)
		{
			default:
				face = "" + value;
				break;
			case 1:
				face = "Ace";
				break;
			case 11:
				face = "Jack";
				break;
			case 12:
				face = "Queen";
				break;
			case 13:
				face = "King";
				break;
		}

		String a = face + " of " + suit;
		return a;
	}
}
