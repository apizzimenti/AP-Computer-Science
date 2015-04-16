// Anthony Pizzimenti
//
// dice class which sums the amount of two random dice rolls
// for AP, my best friend
/* ---------------------- */

public class dice implements Measurable {
    
    private int die1;
    private int die2;
    private String sum;
    
    public dice(int a, int b) {
        die1 = a;
        die2 = b;
        setSum();
    }
    
    public void setSum() {
        int summation = die1 + die2;
        sum = "" + summation;
    }
    
    public String getResult() {
        return sum;
    }
}
