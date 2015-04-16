// Anthony Pizzimenti
//
// tally class designed for the Measurable interface
// for AP, my best friend
/* ---------------------- */

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
        String a = x.getResult();
        
        for (int i = 0; i < tally.length; i++) {
            if (a.equals(item[i])) {
                tally[i]++;
            } else {
                continue;
            }
        }
    }
    
    public int[] getTally() {
        return tally;
    }
}
