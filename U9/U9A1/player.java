//  Anthony Pizzimenti
/*  player class, with default constructor and accessor methods */
//  for AP, my best friend
/*  ---------------------- */

public class player implements Measurable {
    
    private String num;
    private String year;
    private String pos;
    private double points;
    
    public player(String line) {
        String[]data = line.split(" ");
        num = data[0];
        year = data[1];
        pos = data[2];
        points = Double.parseDouble(data[3]);
    }
    
    public String getNum() {
        return num;
    }
    
    public String getYear() {
        return year;
    }
    
    public String getPos() {
        return pos;
    }
    
    public double getMeasure() {
        return points;
    }
}