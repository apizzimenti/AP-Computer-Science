// Anthony Pizzimenti
//
// fielder subclass, with assists, putouts, errors, and fielding pct
/* for AP, my best friend. */
/* ----------------------- */

public class fielder extends BaseballPlayer {
	
	private int assists;
	private int putouts;
	private int errors;
	private double fieldpct;
	
	public fielder(String a, int b, int c, int d, int e) {
		super(a, b);
		assists = c;
		putouts = d;
		errors = e;
	}
	
	public void setStat() {
		double x = (double)assists, y = (double)putouts, z = (double)errors;
		fieldpct = (x + y) / (x + y + z);
	}
	
	public String toString() {
		String best = String.format("%.3f", fieldpct);
		return super.toString() + "\nFielding Percentage: " + best + "\n\n";
	}
}