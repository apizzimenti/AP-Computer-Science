// Anthony Pizzimenti
//
/* salaried worker subclass, which only receives 40 hours of pay */


public class salariedWorker extends worker {
    
    private int hours;
    
    public salariedWorker(String a, double b, int c) {
        super(a, b);
        hours = c;
    }
    
    public double wage() {
        return computePay(40);
    }
}