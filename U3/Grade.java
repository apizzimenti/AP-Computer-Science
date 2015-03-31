//	Anthony Pizzimenti
//
//	This is the Grade class.
//	Dedicated to AP, my best friend.

public class Grade
{
	String origLetter;
	String newLetter;
	double origNumeric;
	double newNumeric;

	public Grade(String a, double b)
	{
		origLetter = a;
		origNumeric = b;
		setNewNumeric();
		setNewLetter();
	}

	public void setNewNumeric()
	{
		String letter = origLetter.substring(0,1);

		if (letter.equals("A"))
			newNumeric = (4.0);

		else if (letter.equals("B"))
			newNumeric = (3.0);

		else if (letter.equals("C"))
			newNumeric = (2.0);

		else if (letter.equals("D"))
			newNumeric = (1.0);

		else if (letter.equals("F"))
			newNumeric = (0.0);


		if (origLetter.length() == 2)
		{
				String sign = origLetter.substring(1,2);

				if ((sign.equals("+")) && (newNumeric != 4))
					newNumeric += (0.3);

				else if (sign.equals("-"))
					newNumeric -= (0.3);

				else if (letter.equals("F"));
					newNumeric = 0;
		}
	}

	public void setNewLetter()
	{
		double a = origNumeric;

		if (a == 4.0)
			newLetter = ("A+");

		else if (a >= 3.85 && a <= 3.99)
			newLetter = ("A");

		else if (a >= 3.50 && a <= 3.84)
			newLetter = ("A-");

		else if (a >= 3.15 && a <= 3.49)
			newLetter = ("B+");

		else if (a >= 2.85 && a <= 3.14)
			newLetter = ("B");

		else if (a >= 2.50 && a <= 2.84)
			newLetter = ("B-");

		else if (a >= 2.15 && a <= 2.49)
			newLetter = ("C+");

		else if (a >= 1.85 && a <= 2.14)
			newLetter = ("C");

		else if (a >= 1.50 && a <= 1.84)
			newLetter = ("C-");

		else if (a >= 1.15 && a <= 1.49)
			newLetter = ("D+");

		else if (a >= 0.85 && a <= 1.14)
			newLetter = ("D");

		else if (a >= 0.50 && a <= 0.84)
			newLetter = ("D-");

		else if (a <= 0.49)
			newLetter = ("F");
	}

	public String getNewLetter()
	{
		return newLetter;
	}

	public double getNewNumeric()
	{
		return newNumeric;
	}
}