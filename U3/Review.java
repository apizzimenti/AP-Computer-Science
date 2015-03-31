import java.util.Scanner;


public class Review
{
	public static void main(String [] args)
 	{
		Review a = new Review();
	}
	public Review()
	{
    	Scanner in = new Scanner(System.in);

   		System.out.print("Suit: ");
    	String a = in.next();

    	System.out.print("Value: ");
    	int b = in.nextInt();

		  System.out.print("Suit: ");
    	String c = in.next();

    	System.out.print("Value: ");
    	int d = in.nextInt();

    	PlayingCard q = new PlayingCard(a, b);
    	PlayingCard r = new PlayingCard(c, d);

    	int ans = compare(q, r);

    	if (ans == 1)
    		System.out.println(q.toString());
    	if (ans == -1)
    		System.out.println(r.toString());
    	if (ans == 0)
    		System.out.println("Cards are identical");
	}

 	public int compare(PlayingCard x, PlayingCard y)
  	{
    	int a;

    	if (x.getValue() > y.getValue())
      		a = 1;
    	else if (x.getValue() < y.getValue())
      		a = -1;

    	else
    	{
      		if (x.getSuit().compareTo(y.getSuit()) > 0)
        		a = 1;
      		else if (x.getSuit().compareTo(y.getSuit()) < 0)
        		a = -1;
      		else
       			a = 0;
  		}

		return a;
	}
}