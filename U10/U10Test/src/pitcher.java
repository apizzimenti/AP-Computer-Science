// Anthony Pizzimenti
//
// pitcher subclass, with innings pitched, earned runs, and earned runs ave
/* for AP, my best friend. */
/* ----------------------- */

public class pitcher extends BaseballPlayer {
	
	private double inpitched;
	private int runsearned;
	private double runsave;
	
	public pitcher(String a, int b, double c, int d) {
		super(a, b);
		inpitched = c;
		runsearned = d;
	}
	
	public void setStat() {
		runsave = (9 * runsearned) / inpitched;
	}
	
	public String toString() {
		String best = String.format("%.2f", runsave);
		return super.toString() + "\nEarned Run Average: " + best + "\n\n";
	}
}