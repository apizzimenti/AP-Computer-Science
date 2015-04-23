public class rightTriangle implements Shape, Comparable {
    
    private double leg1;
    private double leg2;
    
    public rightTriangle(double a, double b) {
        leg1 = a;
        leg2 = b;
    }
    
    public double area() {
        return .5*(leg1 * leg2);
    }
    
    public double perimeter() {
        double hyp = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        return leg1 + leg2 + hyp;
    }
    
    public int compareTo(Object obj) {
        Shape a = (Shape)obj;
        int returner = 1;
        
        if (area() > a.area()) {
            returner = 1;
        } else if (area() < a.area()) {
            returner = -1;
        } else {
            if (perimeter() > a.perimeter()) {
                returner = 1;
            } else if (perimeter() < a.perimeter()) {
                returner = -1;
            } else {
                returner = 0;
            }
        }
        
        return returner;
    }
    
    public String toString() {
        return "Right Triangle[" + leg1 + ", " + leg2 + "]";
    }
}