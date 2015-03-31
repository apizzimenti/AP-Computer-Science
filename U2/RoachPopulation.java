//	Anthony Pizzimenti
//
/*	This is a class created to outline
    the parameters of a roach population.
*/

public class RoachPopulation
{
	private int p;

	public RoachPopulation()
	{
		p = 100;
	}

	public void timePasses()
	{
		p = p * 2;
	}

	public void spray()
	{
		p = p * 9 / 10;
	}

	public int getRoaches()
	{
		return p;
	}
}

