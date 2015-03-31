//	Anthony Pizzimenti
//	Month class.
//	For AP, my best friend.

public class Month
{
	private int month;
	private String days;

	public Month(int a)
	{
		month = a;
		setDays();
	}

	public void setDays()
	{
		switch(month)
		{
			default:
				days = "31 days.";
				break;
			case 1:
			case 4:
			case 6:
			case 8:
			case 9:
			case 11:
				days = "30 days.";
				break;
			case 2:
				days = "28 or 29 days.";
				break;
		}
	}

	public String getDays()
	{
		return days;
	}
}