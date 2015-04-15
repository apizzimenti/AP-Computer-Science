// Anthony Pizzimenti
//
// driver for the card game Hearts
// for AP, my best friend
/* ---------------------- */

import javax.swing.*;
import java.util.*;

public class U9A3 {

    public static void main(String[]args) {

        ArrayList<card> cards = new ArrayList<card>();

        // enters cards
        for (int i = 0; i < 5; i++) {
            String str = JOptionPane.showInputDialog("Enter card suit and value (e.g. Diamonds 8)");
            String[]data = str.split(" ");
            cards.add(new card(data[0], Integer.parseInt(data[1])));
        }

        trick y = new trick(cards);

        // prints trick, winner, points
        System.out.println("The Trick:\n");
        for (int i = 0; i < cards.size(); i++) {
            card x = cards.get(i);
            System.out.println(x);
        }

        System.out.println("\nWinning Card = " + y.getWinner());
        System.out.println("\nPoints in Trick = " + y.getTotalPoints() + "\n");
    }
}
