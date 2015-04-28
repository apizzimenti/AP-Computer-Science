// Anthony Pizzimenti
//
/* piece worker which receives hourly pay plus money for each piece */

public class pieceWorker extends worker {
    
    private int hours;
    
    public pieceWorker(String a, double b, int c) {
        super(a, b);
        hours = c;
    }
    
    public double wage(int pieces) {
        return computePay(pieces) + super.computePay(hours);
    }
    
    public double computePay(int pieces) {
        return pieces * .12;
    }
}