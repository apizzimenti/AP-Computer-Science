// Anthony Pizzimenti
//
/* worker class which calculates pay as well as reorders names */


public class worker {
     
    private String name;
    private double rate;
    
    public double computePay(int hours) {
        return hours * rate;
    }
    
    public String getName() {
        String[]data = name.split(" ");
        return data[1] + ", " + data[0].substring(0, 1) + ".";
    }
}
    
    