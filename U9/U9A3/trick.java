// Anthony Pizzimenti
//
// trick class for the card game hearts, which counts points
// and finds the winning card
// for AP, my best friend
/* ---------------------- */

import java.util.*;

public class trick {

	private ArrayList<card> cards = new ArrayList<card>();
	private int points;

	public trick(ArrayList<card> x) {
		cards = x;
        setTotalPoints();
	}

	public void setTotalPoints() {
        for (int i = 0; i < cards.size(); i++) {
            card x = cards.get(i);
            points += x.getPoints();
        }
	}

    public int getTotalPoints() {
        return points;
    }

    public String getWinner() {
		String winner = null;
        card x = cards.get(0);

        for (int i = 1; i < cards.size(); i++) {
            Object y = cards.get(i);
            int except = x.compareTo(y);

            if (except == 1) {
				continue;
			} else if (except == -1) {
				x = (card)y;
			}
        }
        return x.toString();
    }

	public String toString() {
		String names = null;

		for (int i = 0; i < cards.size(); i++) {
			card x = cards.get(i);
			names += x.toString() + "\n";
		}
		return names;
	}
}