import java.util.*;

public class driver {
    
    public static void main(String[]args) {
        driver app = new driver();
    }
    
    public driver() {
        ArrayList<Comparable> list = new ArrayList<Comparable>();
        
        list.add(new rectangle(5.2, 8.5));
        list.add(new rectangle(3.9, 4.7));
        
        list.add(new rightTriangle(3.7, 5.1));
        list.add(new rightTriangle(1.8, 8.6));
        
        list.add(new rectangle(8.7, 5.5));
        list.add(new rightTriangle(7.9, 6.4));
        
        list.add(new rectangle(4.0, 5.0));
        list.add(new rectangle(5.0, 4.0));
        
        list.add(new rightTriangle(3.0, 4.0));
        list.add(new rightTriangle(2.0, 6.0));
        
        for (int i = 0; i < list.size(); i += 2) {
            Comparable x = (Comparable)list.get(i);
            Comparable y = (Comparable)list.get(i + 1);
            
            int fin = x.compareTo(y);
            
            if (fin == 1) {
                System.out.println(x.toString() + " is greater than " + y.toString());
            } else if (fin == -1) {
                System.out.println(x.toString() + " is less than " + y.toString());
            } else {
                System.out.println("Shapes are equal");
            }
        }
    }
}