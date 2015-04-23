public class rectangle implements Shape, Comparable {
    
    private double length;
    private double width;
    
    public rectangle(double a, double b) {
        length = a;
        width = b;
    }
    
    public double area() {
        return length * width;
    }
    
    public double perimeter() {
        return (2*length) + (2*width);
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
        return "Rectangle [" + length + ", " + width + "]";
    }
}

    
    