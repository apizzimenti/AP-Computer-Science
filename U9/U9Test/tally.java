public class tally {

	private String[]item;
	private int[]tally;

	public tally(String[]a) {
		item = a;
		tally = new int[item.length];

		for (int i = 0; i < tally.length; i++) {
			tally[i] = 0;
		}
	}

	public void process(Measurable x) {
		for (int i = 0; i < tally.length; i++) {
			String first = x.getResult();