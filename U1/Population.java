//	Anthony Pizzimenti
//
/*	This is a class created to outline
    the parameters of a supposed roach
    population.
*/

public class RoachPopulation
{
	private int pop;

	public Population()
	{
		pop = 100;
	}

	public int timePasses()
	{
		int t;
		t = pop * 2;
		return t;
	}

	public double spray()
	{
		double s;
		s = pop * 10;
		return s;
	}

	public int getRoaches()
	{
		return pop;
	}
}

