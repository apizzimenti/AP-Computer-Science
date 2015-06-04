// Anthony Pizzimenti
//
// card class for the card game hearts, which defines each card
// and its value, suit, and point values
// for AP, my best friend
/* ---------------------- */

public class card implements Comparable {
    
    private String suit;
    private int value;
    private String name = "";
    private int points;
    
    public card (String a, int b) {
        suit = a;
        value = b;
        setPoints();
        setValue();
    }
    
    public void setPoints() {
        if (suit.equals("Hearts")) {
            points = 1;
        } else if (suit.equals("Spades") && value == 12) {
            points = 13;
        }
    }
    
    public void setValue() {
        
        switch (value) {
            case 11: name = "Jack";
            break;
            case 12: name = "Queen";
            break;
            case 13: name = "King";
            break;
            case 14: name = "Ace";
            break;
            default: name = "" + value;
            break;
        }
    }
    
    public String getSuit() {
        return suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public int getPoints() {
        return points;
    }
    
    public int compareTo(Object obj) {
        int total = 0;
        card def = (card)obj;
        
        if (getSuit().equals(def.getSuit())) {
            if (getValue() > def.getValue()) {
                total = 1;
            } else if (getValue() == def.getValue()) {
                total = 0;
            } else if (getValue() < def.getValue()) {
                total = -1;
            }
        } else {
            total = 1;
        }
        
        return total;
    }
    
    public String toString() {
        return name + " of " + suit;
    }
}


