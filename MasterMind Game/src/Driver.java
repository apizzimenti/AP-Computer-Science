import javax.swing.JOptionPane;

public class Driver {
	
	public static void main(String[]args) {
		Reader x = new Reader();
		String fw = x.getWord();
		int count = 0;

		for (int i = 0; i < 10; i++) {
			String tester = JOptionPane.showInputDialog(null, "Guess away!", "MasterMind", JOptionPane.INFORMATION_MESSAGE);
			String best = x.analyze(tester);
			
			if (tester.equals(fw)) {
				x.editPoints(100 - (i * 10));
				break;
			} else {
				System.out.println(best);
			}
		}
		
		if (count == 0) {
			x.editPoints(-8);
			System.out.println("Wow, first try!");
			System.out.println("You got " + x.getPoints() + " points!");
		} else if (count == 9){
			System.out.println("The word you were looking for was " + fw + ".");
			System.out.println("You only got " + x.getPoints() + " points.");
		} else {
			System.out.println("Nice work, you got " + x.getPoints() + " points.");
		}
	}
}