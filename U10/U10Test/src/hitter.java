public class hitter extends BaseballPlayer {
	
	private int atbat;
	private int hits;
	private double batave;
	
	public hitter(String a, int b, int c, int d) {
		super(a, b);
		atbat = c;
		hits = d;
	}
	
	public void setStat() {
		batave = (double)hits / (double)atbat;
	}
	
	public String toString() {
		String best = String.format("%.3f", batave);
		return super.toString() + "\nBatting Average: " + best + "\n\n";
	}

}