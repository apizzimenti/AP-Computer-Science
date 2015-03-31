//      Anthony Pizzimenti
//
//      This is the Postage class.
//
//      For AP, my best friend.

public class Postage
{
	private String type;
	private double weight;

	public Postage(String a, double b)
	{
		type = a;
		weight = b;
	}

	public double calculate()
	{
		double cost = 0.0;

		if (type.equals("F"))
		{
			double d = Math.ceil(weight);

			if (weight == 1)
				cost = 0.34;

			if (weight > 1 && weight <= 13)
				cost = 0.34 + (.21 * (d-1));

			if (weight > 13)
			type = "P";
		}

		if (type.equals("P"))
		{
			double a = (weight - 32) / 16;
			int b = (int)a;

			if (weight <= 16)
				cost = 3.5;

			else if (weight > 16 && weight <= 32)
				cost = 3.95;

			else if (weight > 32)
				cost = 5.15 + (1.2 * b);

		}

		return cost;
	}
}

